package cz.petrflajsingr.clion_plugin.assert_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import cz.petrflajsingr.clion_plugin.base_actions.InsertTextAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID


abstract class InsertAssertActionBase : InsertTextAction() {
    abstract fun getAssertName(): String

    override fun getTextToInsert(): String {
        return """%s(%s, (EXPRESSION), Log::, "");""".format(getAssertName(), generateRandomAssertID())
    }
    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}