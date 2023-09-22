import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.compile.JavaCompile

plugins {
  application
  java
}

java { sourceSets { getByName("main") { java { setSrcDirs(listOf("src")) } } } }

// Force Unicode.
tasks.withType<JavaCompile> { options.encoding = "UTF-8" }

// Función para recorrer recursivamente los subdirectorios y generar tareas
fun processDirectory(directorio: File, nombreDirectorio: String) {
  // Obtener la lista de archivos .java en el directorio
  val archivosJava = directorio.listFiles()?.filter { it.isFile && it.name.endsWith(".java") }

  // Comprobar si el directorio contiene un archivo Main.java
  val containsMainJava = archivosJava?.any { it.name == "Main.java" } ?: false

  if (containsMainJava) {
    // Si hay un archivo Main.java, compilar todos los archivos .java en un solo JAR

    val packageName = nombreDirectorio.capitalize()

    // Crear una tarea de compilación para el directorio
    val compilarTarea =
        tasks.register<JavaCompile>("compile-$packageName") {
          source = fileTree(directorio).matching { include("**/*.java") }
          classpath = sourceSets["main"].compileClasspath
          destinationDirectory.set(file("$buildDir/classes/java/main"))
        }

    // Crear una tarea de empaquetado JAR para el directorio
    tasks.register<Jar>("build-$packageName") {
      manifest { attributes["Main-Class"] = "$packageName.Main" }
      dependsOn(compilarTarea)
      from(compilarTarea.get().destinationDirectory)
      archiveBaseName.set(packageName)
    }
  } else {
    // Si no hay un archivo Main.java, compilar cada archivo .java en un JAR separado
    archivosJava?.forEach { archivo ->
      val nombreArchivo = archivo.nameWithoutExtension

      val packageName = "${nombreDirectorio.capitalize()}.${nombreArchivo.capitalize()}"

      // Crear una tarea de compilación para el archivo
      val compilarTarea =
          tasks.register<JavaCompile>("compile-$packageName") {
            source = fileTree(archivo)
            classpath = sourceSets["main"].compileClasspath
            destinationDirectory.set(file("$buildDir/classes/java/main"))
          }

      // Crear una tarea de empaquetado JAR para el archivo
      tasks.register<Jar>("build-$packageName") {
        manifest { attributes["Main-Class"] = packageName }
        dependsOn(compilarTarea)
        from(compilarTarea.get().destinationDirectory)
        archiveBaseName.set(packageName)
      }
    }
  }

  // Recorrer los subdirectorios y generar tareas para ellos
  directorio.listFiles()?.filter { it.isDirectory() }?.forEach { subdirectorio ->
    processDirectory(subdirectorio, "$nombreDirectorio.${subdirectorio.name}")
  }
}

// Obtener la lista de directorios en src/
val directorios = file("src").listFiles()?.filter { it.isDirectory() } ?: emptyList()

// Para cada directorio, procesarlo
directorios.forEach { directorio -> processDirectory(directorio, directorio.name) }
