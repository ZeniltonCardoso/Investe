plugins {
    id("com.android.library")
    id("kotlin-android")
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
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.extJunit)
    androidTestImplementation(libs.espressoCore)
    implementation(libs.runtime.android)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
}