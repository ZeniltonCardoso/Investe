plugins {
    id("com.android.library")
    id("kotlin-android")
}

apply(from = "${rootProject.projectDir}/android-common.gradle")

android {
    namespace = "br.zc.uikit"

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.bundles.composeDependecies)
    implementation(libs.ui.tooling.preview.android)
    implementation(libs.foundation.android)
    implementation("androidx.compose.material3:material3:1.1.2")
    implementation(libs.androidXCore)
    implementation(libs.appCompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.extJunit)
    androidTestImplementation(libs.espressoCore)
    implementation(libs.runtime.android)
}