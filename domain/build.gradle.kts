plugins {
    id("kotlin")
    id("kotlinx-serialization")
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.koinCore)
    implementation(libs.gson)
    implementation(libs.kotlinx.serialization.json)
}