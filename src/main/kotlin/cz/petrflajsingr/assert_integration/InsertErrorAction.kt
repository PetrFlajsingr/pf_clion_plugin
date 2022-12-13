package cz.petrflajsingr.assert_integration

class InsertErrorAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_ERROR"
    }

    override fun getActionName(): String {
        return "InsertError"
    }
}