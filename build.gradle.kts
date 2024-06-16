plugins {
    id("java")
    application
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

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("com.codehunter.Main")
}
