plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply(from = "${rootProject.projectDir}/android-common.gradle")

android{ namespace = "br.zc.data_remote"
    compileSdk = 34
}
dependencies {
    implementation(libs.bundles.commonDependecies)
    testImplementation(libs.junit)
    androidTestImplementation(libs.extJunit)
    androidTestImplementation(libs.espressoCore)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    api(libs.okhttp)
    implementation(libs.logging.interceptor)

    implementation(libs.kotlinx.coroutines.core)

    implementation(libs.koinCore)
    implementation(libs.dataStore)

    implementation(project(":data"))
}