package cz.petrflajsingr.nihil_clion_plugin.wrap_actions

import cz.petrflajsingr.nihil_clion_plugin.base_actions.WrapSelectionAction

class WrapUnoptimizePragmaAction : WrapSelectionAction() {
    override val wrapStart get() = """#pragma optimize( "", off ) """
    override val wrapEnd get() = """#pragma optimize( "", on ) """
    override val actionName get() = "WrapUnoptimize"
}