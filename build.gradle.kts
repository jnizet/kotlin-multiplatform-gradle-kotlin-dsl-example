buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.71")
    }
}

apply(plugin = "kotlin-platform-common")

repositories {
    mavenCentral()
}

dependencies {
    val kotlinVersion = "1.2.71"
    "compile"("org.jetbrains.kotlin:kotlin-stdlib-common:$kotlinVersion")
    "testCompile"("org.jetbrains.kotlin:kotlin-test-common:$kotlinVersion")
}
