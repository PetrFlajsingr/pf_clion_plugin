package cz.petrflajsingr.assert_integration

class InsertDbgErrorAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_DBG_ERROR"
    }

    override fun getActionName(): String {
        return "InsertDbgError"
    }
}