package cz.petrflajsingr.nihil_clion_plugin.assert_actions

class InsertWarnAction : InsertErrorActionBase() {
    override val errorName get() = "NIHIL_WARN"
    override val actionName get() = "InsertWarn"
}