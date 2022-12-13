package cz.petrflajsingr.assert_integration

class InsertDbgWarnAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "DBG_WARN"
    }

    override fun getActionName(): String {
        return "InsertDbgWarn"
    }
}