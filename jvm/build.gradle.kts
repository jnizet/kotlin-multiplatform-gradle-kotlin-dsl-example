// ideally, we would apply the kotlin-platform-jvm plugin from a plugins block here.
// unfortunately, this plugin doesn't seem to be available in the plugin portal
// in order to be able to use the idiomatic, type-safe DSL, we apply the plugin programmatically
// from the root project instead (which has the same effect of making the extensions, configurations, etc.
// defined by the plugin in a type-safe, discoverable way: implementation, expectedBy, testImplementation in this
// example)

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}")
    expectedBy(project(":common"))
    testImplementation("junit:junit:4.12")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:${kotlinVersion}")
    testImplementation("org.jetbrains.kotlin:kotlin-test:${kotlinVersion}")
}
