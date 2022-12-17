package cz.petrflajsingr.clion_plugin

class InsertEnsureAction : InsertAssertActionBase() {
    override fun getAssertName(): String {
        return "PF_ENSURE"
    }

    override fun getActionName(): String {
        return "InsertEnsure"
    }
}