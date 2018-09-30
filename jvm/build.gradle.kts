buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.71")
    }
}

apply(plugin = "kotlin-platform-jvm")

repositories {
    mavenCentral()
}

dependencies {
    val kotlinVersion = "1.2.71"
    "compile"("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    "expectedBy"(project(":"))
    "testCompile"("junit:junit:4.12")
    "testCompile"("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
    "testCompile"("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")
}
