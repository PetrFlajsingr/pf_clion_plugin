package cz.petrflajsingr.assert_integration

import com.intellij.openapi.actionSystem.AnActionEvent


abstract class InsertErrorActionBase : InsertTextActionBase() {

    abstract fun getErrorName(): String

    override fun getTextToInsert(): String {
        return """%s(%s, Log::, "");""".format(getErrorName(), generateRandomHexString())
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}