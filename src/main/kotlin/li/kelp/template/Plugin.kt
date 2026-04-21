package li.kelp.template

import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit
import li.kelp.template.commands.OpenMyUiCommand
import li.kelp.vuetale.Plugin
import li.kelp.vuetale.javascript.ModuleRegistry

class Plugin(init: JavaPluginInit) : JavaPlugin(init) {
    override fun setup() {
        ModuleRegistry.registerModule("myMod", Plugin::class.java)

        this.getCommandRegistry().registerCommand(OpenMyUiCommand())
    }
}