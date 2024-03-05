pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "Démonstrations"
include(":app")
include(":mod2variables")
include(":mod2boucles")
include(":mod2conditions")
include(":mod2fonctions")
include(":mod2structuredeclasse")
include(":mod2heritage")
include(":mod2interface")
include(":mod3layoutxml")
include(":mod3compose")
