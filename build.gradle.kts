buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}
// apply the plugins on the child projects from here so that the extensions, configurations etc. that they define is
// available in a type-safe, discoverable way from the child projects build scripts.

project(":common") {
    apply(plugin = "kotlin-platform-common")
}
project(":jvm") {
    apply(plugin = "kotlin-platform-jvm")
}
