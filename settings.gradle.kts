pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "ComposePreviewTest"
include(":app")
include(":androidlib")

// If kmm module is included, task :app:assemble will run.
//
// If kmm module is excluded the following tasks will run [:app:generateDemoDebugSources, :app:createMockableJar,
// :app:generateDemoDebugAndroidTestSources, :app:compileDemoDebugUnitTestSources,
// :app:compileDemoDebugAndroidTestSources, :app:compileDemoDebugSources]
//include(":kmm")
