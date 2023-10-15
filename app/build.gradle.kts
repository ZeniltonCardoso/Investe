plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.firebase.crashlytics")
    id("com.google.gms.google-services")
}
apply(from = "${rootProject.projectDir}/android-common.gradle")
android {
    namespace = "br.zc.investe"
    compileSdk = 34

    defaultConfig {
        applicationId = "br.zc.investe"
        targetSdk = 33
        versionCode = libs.versions.androidVersionCode.getOrElse("").toInt()
        versionName = libs.versions.androidVersionName.getOrElse("")

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildFeatures {
        compose = true
    }

    packagingOptions.resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
}

dependencies {
    implementation(libs.androidSplashScreen)
    implementation(libs.androidXCore)
    implementation(libs.lifecycle)
    implementation(libs.activityCompose)
    implementation(platform("androidx.compose:compose-bom:2023.09.02"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(libs.navigation.runtime.ktx)
    implementation(libs.navigation)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)
    testImplementation(libs.junit)
    androidTestImplementation(libs.extJunit)
    androidTestImplementation(libs.espressoCore)
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.09.02"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation(project(":di"))
    implementation(project(":data"))
    implementation(project(":uikit"))
}