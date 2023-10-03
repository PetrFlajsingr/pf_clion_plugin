package cz.petrflajsingr.nihil_clion_plugin.assert_actions

class InsertNotImplementedErrorAction : InsertErrorActionBase() {
    override val errorName get() = "NIHIL_ERROR"
    override val message get() = "Function not implemented"
    override val actionName get() = "InsertNotImplementedError"
}