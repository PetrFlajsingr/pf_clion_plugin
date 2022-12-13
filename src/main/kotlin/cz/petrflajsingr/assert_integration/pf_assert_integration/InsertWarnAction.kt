package cz.petrflajsingr.assert_integration.pf_assert_integration

class InsertWarnAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "WARN"
    }

    override fun getActionName(): String {
        return "InsertWarn"
    }
}