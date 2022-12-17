package cz.petrflajsingr.clion_plugin

class InsertVerifyAction : InsertAssertActionBase() {
    override fun getAssertName(): String {
        return "PF_VERIFY"
    }

    override fun getActionName(): String {
        return "InsertVerify"
    }
}