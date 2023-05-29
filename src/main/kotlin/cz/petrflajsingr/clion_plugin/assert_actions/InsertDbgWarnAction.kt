package cz.petrflajsingr.clion_plugin.assert_actions

class InsertDbgWarnAction : InsertErrorActionBase() {
    override fun getErrorName() = "NIHIL_DBG_WARN"
    override fun getActionName() = "InsertDbgWarn"
}