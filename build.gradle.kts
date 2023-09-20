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

// At the moment only the files in the OOP folder are executed.
val cmdDirs = file("src/OOP").listFiles()?.filter { it.isDirectory() } ?: emptyList()

// Create a compilation task for each directory.
cmdDirs.forEach { dir ->
    tasks.register<Jar>("build${dir.name.capitalize()}") {
        group = "build"

	manifest {
	    attributes["Main-Class"] = "OOP.${dir.name}.Main"
	}

	from(sourceSets.main.get().output)
	archiveBaseName.set(dir.name)
        archiveVersion.set("")
    }
}
