package cz.petrflajsingr.clion_plugin.wrap_actions

import cz.petrflajsingr.clion_plugin.base_actions.WrapSelectionAction

class WrapUnoptimizePragmaAction : WrapSelectionAction() {
    override fun getWrapStart(): String {
        return """#pragma optimize( "", off ) """
    }

    override fun getWrapEnd(): String {
        return """#pragma optimize( "", on ) """
    }

    override fun getActionName(): String {
        return "WrapUnoptimize"
    }
}