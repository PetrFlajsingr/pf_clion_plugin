package cz.petrflajsingr.assert_integration.pf_assert_integration

class InsertAssertAction : InsertAssertActionBase() {
    override fun getAssertName(): String {
        return "ASSERT"
    }

    override fun getActionName(): String {
        return "InsertAssert"
    }
}