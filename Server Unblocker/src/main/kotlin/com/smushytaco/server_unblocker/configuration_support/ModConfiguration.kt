package com.smushytaco.server_unblocker.configuration_support
import com.smushytaco.server_unblocker.ServerUnblocker
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment
@Config(name = ServerUnblocker.MOD_ID)
class ModConfiguration: ConfigData {
    @Comment("Default value is yes. If set to yes you'll be able to join blacklisted Minecraft servers. If set to no you won't be able to.")
    val serversAreUnblocked = true
}