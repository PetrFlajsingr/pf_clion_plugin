package cz.petrflajsingr.clion_plugin.assert_actions

class InsertWarnAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_WARN"
    }

    override fun getActionName(): String {
        return "InsertWarn"
    }
}