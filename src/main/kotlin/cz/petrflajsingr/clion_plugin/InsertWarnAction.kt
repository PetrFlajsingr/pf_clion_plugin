package cz.petrflajsingr.clion_plugin

class InsertWarnAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_WARN"
    }

    override fun getActionName(): String {
        return "InsertWarn"
    }
}