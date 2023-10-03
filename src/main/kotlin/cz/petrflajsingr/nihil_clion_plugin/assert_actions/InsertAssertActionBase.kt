package cz.petrflajsingr.nihil_clion_plugin.assert_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import cz.petrflajsingr.nihil_clion_plugin.base_actions.InsertTextAction
import cz.petrflajsingr.nihil_clion_plugin.generateRandomAssertID


abstract class InsertAssertActionBase : InsertTextAction() {
    abstract val assertName: String
    override val textToInsert
        get() = """%s(%s, (EXPRESSION), LogTemp, "Message");""".format(
            assertName,
            generateRandomAssertID()
        )
    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}