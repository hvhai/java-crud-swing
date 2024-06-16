plugins {
    id("java")
    id("org.graalvm.buildtools.native") version("0.10.2")
}

group = "com.codehunter"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // GUI
    implementation("com.intellij:forms_rt:7.0.3")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.codehunter.Main"

    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
}

graalvmNative {
    binaries {
        named("main") {
            imageName.set("crud-swing-app")
            mainClass.set("com.codehunter.Main")
            buildArgs.add("-Djava.awt.headless=false")
        }
        named("test") {
//            buildArgs.add("-O0")
        }
    }
    binaries.all {
        buildArgs.add("--verbose")
//        buildArgs.add("-Djava.awt.headless=false")
    }
}
tasks.test {
    useJUnitPlatform()
}

