package com.smushytaco.server_unblocker
import io.wispforest.owo.config.annotation.Config
import io.wispforest.owo.config.annotation.Modmenu
import io.wispforest.owo.config.annotation.RestartRequired
@Modmenu(modId = ServerUnblocker.MOD_ID)
@Config(name = ServerUnblocker.MOD_ID, wrapperName = "ModConfig")
@Suppress("UNUSED")
class ModConfiguration {
    @JvmField
    @RestartRequired
    var serversAreUnblocked = true
}