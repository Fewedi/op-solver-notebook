
val dataframeVersion = "0.15.0"

plugins {
    kotlin("jvm") version "2.1.20"
    id("org.jetbrains.kotlinx.dataframe") version "0.15.0"
}

group = "masterthesis"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:dataframe:$dataframeVersion")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}