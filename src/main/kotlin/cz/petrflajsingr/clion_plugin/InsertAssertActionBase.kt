package cz.petrflajsingr.clion_plugin

import com.intellij.openapi.actionSystem.AnActionEvent


abstract class InsertAssertActionBase : InsertTextActionBase() {
    abstract fun getAssertName(): String

    override fun getTextToInsert(): String {
        return """%s(%s, (EXPRESSION), Log::, "");""".format(getAssertName(), generateRandomAssertID())
    }
    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}