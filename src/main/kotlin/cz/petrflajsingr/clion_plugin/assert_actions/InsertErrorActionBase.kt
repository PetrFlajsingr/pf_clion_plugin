package cz.petrflajsingr.clion_plugin.assert_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import cz.petrflajsingr.clion_plugin.base_actions.InsertTextAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID


abstract class InsertErrorActionBase : InsertTextAction() {

    abstract fun getErrorName(): String

    override fun getTextToInsert(): String {
        return """%s(%s, Log::, "");""".format(getErrorName(), generateRandomAssertID())
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}