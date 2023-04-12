plugins {
    kotlin("js") version "1.8.10"
}

group = "ai.nobleteam"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.385")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.385")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.10.4-pre.385")
}

kotlin {
    js (IR){
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
}