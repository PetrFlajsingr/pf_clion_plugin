package cz.petrflajsingr.assert_integration

class WrapUnoptimizePragmaAction : WrapSelectionActionBase() {
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