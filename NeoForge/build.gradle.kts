plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-neoforge")
}

dependencies {
    modApi(sharedLibs.puzzleslib.neoforge)
    modApi(sharedLibs.hotbarslotcycling.neoforge)
    include(sharedLibs.hotbarslotcycling.neoforge)
}
