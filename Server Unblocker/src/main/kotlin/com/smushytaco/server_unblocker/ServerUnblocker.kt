package com.smushytaco.server_unblocker
import net.fabricmc.api.ClientModInitializer
object ServerUnblocker : ClientModInitializer {
    const val MOD_ID = "server_unblocker"
    val config = ModConfig.createAndLoad()
    override fun onInitializeClient() {}
}