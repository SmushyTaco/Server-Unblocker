package com.smushytaco.server_unblocker
import com.smushytaco.server_unblocker.configuration_support.ModConfiguration
import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ClientModInitializer
object ServerUnblocker : ClientModInitializer {
    const val MOD_ID = "server_unblocker"
    lateinit var config: ModConfiguration
        private set
    override fun onInitializeClient() {
        AutoConfig.register(ModConfiguration::class.java) { definition: Config, configClass: Class<ModConfiguration> ->
            GsonConfigSerializer(definition, configClass)
        }
        config = AutoConfig.getConfigHolder(ModConfiguration::class.java).config
    }
}