package cz.petrflajsingr.assert_integration.pf_assert_integration

class InsertEnsureAction : InsertAssertActionBase() {
    override fun getAssertName(): String {
        return "ENSURE"
    }

    override fun getActionName(): String {
        return "InsertEnsure"
    }
}