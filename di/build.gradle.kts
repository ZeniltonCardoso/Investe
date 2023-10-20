plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply(from = "${rootProject.projectDir}/android-common.gradle")
android {
    namespace = "br.zc.di"
    compileSdk = 34
}

dependencies {
    implementation(project(path = ":data"))
    implementation(project(path = ":data_remote"))
    implementation(project(path = ":data_local"))
    implementation(project(path = ":domain"))
    implementation(project(path = ":feature_authentication"))
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
    implementation(libs.bundles.koinDependences)
    implementation(libs.navigation)
    testImplementation(libs.koinTest)
    implementation(libs.dataStore)
}