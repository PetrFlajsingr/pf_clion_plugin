package cz.petrflajsingr.clion_plugin.assert_actions

class InsertDbgErrorAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_DBG_ERROR"
    }

    override fun getActionName(): String {
        return "InsertDbgError"
    }
}