package cz.petrflajsingr.nihil_clion_plugin.assert_actions

class InsertErrorAction : InsertErrorActionBase() {
    override val errorName get() = "NIHIL_ERROR"
    override val actionName get() = "InsertError"
}