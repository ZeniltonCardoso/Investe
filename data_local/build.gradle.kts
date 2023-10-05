plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}
apply(from = "${rootProject.projectDir}/android-common.gradle")
android{ namespace = "br.zc.data_local"
    compileSdk = 34
}
dependencies {
    implementation(project(":data"))
    implementation(libs.dataStore)
}