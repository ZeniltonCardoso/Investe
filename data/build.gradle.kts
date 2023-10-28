plugins {
    id("kotlin")
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
    api(project(":domain"))
}