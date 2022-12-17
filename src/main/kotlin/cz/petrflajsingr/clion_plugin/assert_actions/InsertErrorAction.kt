package cz.petrflajsingr.clion_plugin.assert_actions

class InsertErrorAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_ERROR"
    }

    override fun getActionName(): String {
        return "InsertError"
    }
}