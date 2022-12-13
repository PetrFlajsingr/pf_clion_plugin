package cz.petrflajsingr.assert_integration

class InsertWarnAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_WARN"
    }

    override fun getActionName(): String {
        return "InsertWarn"
    }
}