package cz.petrflajsingr.assert_integration.pf_assert_integration

class InsertVerifyAction : InsertAssertActionBase() {
    override fun getAssertName(): String {
        return "VERIFY"
    }

    override fun getActionName(): String {
        return "InsertVerify"
    }
}