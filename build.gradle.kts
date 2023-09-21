// Kotlin Gradle Build File.

plugins {
    application
    java
}

java {
    sourceSets {
        getByName("main") {
            java {
                setSrcDirs(listOf("src"))
            }
        }
    }
}

// Force Unicode.
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

val cmdDirs = file("src/OOP").listFiles()?.filter { it.isDirectory() } ?: emptyList()

// Create a compilation task for each directory.
cmdDirs.forEach { dir ->
    tasks.register<Jar>("build-OOP-${dir.name.capitalize()}") {
        group = "build"

	manifest {
	    attributes["Main-Class"] = "OOP.${dir.name}.Main"
	}

	from(sourceSets.main.get().output)
	archiveBaseName.set("OOP-${dir.name}")
        archiveVersion.set("")
    }
}

fileTree("src/Methods").forEach { file ->
    val className = file.nameWithoutExtension

    // Create a compilation task for each file.
    tasks.register<Jar>("build-Methods-${className.capitalize()}") {
        group = "build"

        manifest {
            attributes["Main-Class"] = "Methods.$className"
        }

        from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
	archiveBaseName.set("Methods-${className}")
        with(tasks.jar.get())
    }
}