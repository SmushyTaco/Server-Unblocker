package com.smushytaco.server_unblocker
import io.wispforest.owo.config.annotation.*
@Modmenu(modId = ServerUnblocker.MOD_ID)
@Config(name = ServerUnblocker.MOD_ID, wrapperName = "ModConfig")
@Suppress("UNUSED")
class ModConfiguration {
    @JvmField
    var serversAreUnblocked = true
}