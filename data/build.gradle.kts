plugins {
    id("kotlin")
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    api(project(":domain"))
}