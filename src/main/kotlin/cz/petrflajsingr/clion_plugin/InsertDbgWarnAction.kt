package cz.petrflajsingr.clion_plugin

class InsertDbgWarnAction : InsertErrorActionBase() {
    override fun getErrorName(): String {
        return "PF_DBG_WARN"
    }

    override fun getActionName(): String {
        return "InsertDbgWarn"
    }
}