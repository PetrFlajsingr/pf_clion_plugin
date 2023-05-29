package cz.petrflajsingr.clion_plugin.wrap_actions

import cz.petrflajsingr.clion_plugin.base_actions.WrapSelectionAction

class WrapUnoptimizePragmaAction : WrapSelectionAction() {
    override fun getWrapStart() = """#pragma optimize( "", off ) """
    override fun getWrapEnd() = """#pragma optimize( "", on ) """
    override fun getActionName() = "WrapUnoptimize"
}