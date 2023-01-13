group = "io.github.paulgriffith"
version = "1.0-SNAPSHOT"

plugins {
    application
    java
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
        vendor.set(JvmVendorSpec.AZUL)
    }
}

application {
    mainClass.set("io.github.paulgriffith.SwingEventTester")
}
