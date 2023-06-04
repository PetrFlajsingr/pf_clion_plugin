package cz.petrflajsingr.clion_plugin.base_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID

abstract class InsertOrOverwriteTextAction : InsertTextAction {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description)

    override fun actionPerformed(event: AnActionEvent) {
        val editor = event.getRequiredData(CommonDataKeys.EDITOR)
        val project = event.getRequiredData(CommonDataKeys.PROJECT)
        val document = editor.document
        val caret = editor.caretModel.primaryCaret

        WriteCommandAction
            .writeCommandAction(project)
            .withName(getActionName())
            .withGlobalUndo()
            .run<Exception> {
                document.replaceString(caret.selectionStart, caret.selectionEnd, getTextToInsert())
            }
    }
}