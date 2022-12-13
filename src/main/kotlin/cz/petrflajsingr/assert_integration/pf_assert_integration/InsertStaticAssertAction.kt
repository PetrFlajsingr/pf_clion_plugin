package cz.petrflajsingr.assert_integration.pf_assert_integration

class InsertStaticAssertAction : InsertTextActionBase() {
    override fun getTextToInsert(): String {
        return """STATIC_ASSERT(%s, EXPRESSION, "");""".format(generateRandomHexString())
    }

    override fun getActionName(): String {
        return "InsertStaticAssert"
    }
}