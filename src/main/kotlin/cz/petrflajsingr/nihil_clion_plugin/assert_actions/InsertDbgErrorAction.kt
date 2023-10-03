package cz.petrflajsingr.nihil_clion_plugin.assert_actions

class InsertDbgErrorAction : InsertErrorActionBase() {
    override val errorName get() = "NIHIL_DBG_ERROR"
    override val actionName get() = "InsertDbgError"
}