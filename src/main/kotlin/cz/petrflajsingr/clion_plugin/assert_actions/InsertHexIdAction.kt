package cz.petrflajsingr.clion_plugin.assert_actions

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID


class InsertHexIdAction : AnAction {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description, null)
    // using main UI thread
    override fun getActionUpdateThread() = ActionUpdateThread.EDT
    override fun actionPerformed(event: AnActionEvent) {
        val editor = event.getRequiredData(CommonDataKeys.EDITOR)
        val project = event.getRequiredData(CommonDataKeys.PROJECT)
        val document = editor.document
        val caret = editor.caretModel.primaryCaret

        WriteCommandAction
                .writeCommandAction(project)
                .withName("InsertID")
                .withGlobalUndo()
                .run<Exception> {
                    document.replaceString(caret.selectionStart, caret.selectionEnd, generateRandomAssertID())
                }
    }
    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}