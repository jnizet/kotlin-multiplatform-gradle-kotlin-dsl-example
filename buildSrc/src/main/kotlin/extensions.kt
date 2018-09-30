import org.gradle.api.Project

/**
 * This extension property allows defining the kotlin version once and only once, and to access it from any project using
 * project.kotlinVersion (or simply kotlinVersion, since the `this` of a build script is the project)
 */
val Project.kotlinVersion get() = "1.2.71"
