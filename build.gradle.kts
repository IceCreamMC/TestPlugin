plugins {
    `java`
}

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://repo.icecreammc.xyz/releases/")
    maven("https://libraries.minecraft.net/")
    maven("https://repo.spongepowered.org/maven/")
}

dependencies {
    implementation("net.kyori:adventure-api:4.17.0")
    implementation("com.mojang:brigadier:1.0.500")
    implementation("xyz.icecreammc:api:1.21.1-build.2")
}
