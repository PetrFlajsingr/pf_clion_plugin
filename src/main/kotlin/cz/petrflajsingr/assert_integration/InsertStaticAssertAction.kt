package cz.petrflajsingr.assert_integration

class InsertStaticAssertAction : InsertTextActionBase() {
    override fun getTextToInsert(): String {
        return """PF_STATIC_ASSERT(%s, EXPRESSION, "");""".format(generateRandomHexString())
    }

    override fun getActionName(): String {
        return "InsertStaticAssert"
    }
}