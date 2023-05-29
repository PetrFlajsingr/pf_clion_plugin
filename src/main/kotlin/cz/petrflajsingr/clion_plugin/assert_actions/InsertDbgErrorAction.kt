package cz.petrflajsingr.clion_plugin.assert_actions

class InsertDbgErrorAction : InsertErrorActionBase() {
    override fun getErrorName() = "NIHIL_DBG_ERROR"
    override fun getActionName() = "InsertDbgError"
}