package cz.petrflajsingr.clion_plugin.assert_actions

class InsertWarnAction : InsertErrorActionBase() {
    override fun getErrorName() = "NIHIL_WARN"
    override fun getActionName() = "InsertWarn"
}