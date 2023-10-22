pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Investe"
include(":app")
include(":domain")
include(":data")
include(":data_local")
include(":data_remote")
include(":di")
include(":uikit")
include(":feature_main")
