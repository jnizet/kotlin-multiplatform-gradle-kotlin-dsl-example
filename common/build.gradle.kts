// ideally, we would apply the kotlin-platform-common plugin from a plugins block here.
// unfortunately, this plugin doesn't seem to be available in the plugin portal
// in order to be able to use the idiomatic, type-safe DSL, we apply the plugin programmatically
// from the root project instead (which has the same effect of making the extensions, configurations, etc.
// defined by the plugin in a type-safe, discoverable way: implementation, testImplementation in this example)

repositories {
    mavenCentral()
}

dependencies {
    // implementation is the replacement for the deprecated compile configuration
    implementation("org.jetbrains.kotlin:kotlin-stdlib-common:${kotlinVersion}")

    // testImplementation is the replacement for the deprecated testCompile configuration
    testImplementation("org.jetbrains.kotlin:kotlin-test-common:${kotlinVersion}")
}
