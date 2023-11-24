plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.google.gms.google-services")
}

apply(from = "${rootProject.projectDir}/android-common.gradle")

android {
    namespace = "br.zc.feature_authentication"

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":uikit"))
    implementation(libs.bundles.composeDependecies)
    implementation(libs.ui.tooling.preview.android)
    implementation(libs.foundation.android)
    implementation(libs.material3)
    implementation(libs.androidXCore)
    implementation(libs.appCompat)
    implementation(libs.bundles.koinDependences)
    implementation(libs.material)
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation(libs.play.services.auth)
    implementation("io.coil-kt:coil-compose:2.2.2")
    testImplementation(libs.junit)
    androidTestImplementation(libs.extJunit)
    androidTestImplementation(libs.espressoCore)
    implementation(libs.runtime.android)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
}