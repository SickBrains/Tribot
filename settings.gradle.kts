rootProject.name = "tribot-script-template"

include("libraries:my-library")

include("scripts:my-script")
include("scripts")
include("libraries:framework")
include("scripts:cooks-assistant")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}