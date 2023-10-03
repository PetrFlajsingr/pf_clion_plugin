package cz.petrflajsingr.nihil_clion_plugin.assert_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import cz.petrflajsingr.nihil_clion_plugin.base_actions.InsertTextAction
import cz.petrflajsingr.nihil_clion_plugin.generateRandomAssertID

abstract class InsertErrorActionBase : InsertTextAction() {
    abstract val errorName: String
    override val textToInsert
        get() = """%s(%s, LogTemp, "%s");""".format(
            errorName, generateRandomAssertID(),
            message
        )
    open val message get() = ""
    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}