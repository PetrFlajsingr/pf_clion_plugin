package cz.petrflajsingr.clion_plugin.assert_actions

class InsertAssertAction : InsertAssertActionBase() {
    override fun getAssertName(): String {
        return "PF_ASSERT"
    }

    override fun getActionName(): String {
        return "InsertAssert"
    }
}