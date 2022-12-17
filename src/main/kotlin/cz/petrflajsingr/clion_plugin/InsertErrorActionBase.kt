package cz.petrflajsingr.clion_plugin

import com.intellij.openapi.actionSystem.AnActionEvent


abstract class InsertErrorActionBase : InsertTextActionBase() {

    abstract fun getErrorName(): String

    override fun getTextToInsert(): String {
        return """%s(%s, Log::, "");""".format(getErrorName(), generateRandomAssertID())
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}