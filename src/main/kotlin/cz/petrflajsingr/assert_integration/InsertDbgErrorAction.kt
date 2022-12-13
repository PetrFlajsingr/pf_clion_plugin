package cz.petrflajsingr.assert_integration

class InsertDbgErrorAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "DBG_ERROR"
    }

    override fun getActionName(): String {
        return "InsertDbgError"
    }
}