plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-neoforge")
}

dependencies {
    modCompileOnly(sharedLibs.puzzleslib.common)
    modApi(sharedLibs.puzzleslib.neoforge)
    modCompileOnly(sharedLibs.hotbarslotcycling.common)
    modApi(sharedLibs.hotbarslotcycling.neoforge)
    include(sharedLibs.hotbarslotcycling.neoforge)
}
