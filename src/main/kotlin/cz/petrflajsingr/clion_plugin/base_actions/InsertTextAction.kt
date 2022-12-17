package cz.petrflajsingr.clion_plugin.base_actions

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction


abstract class InsertTextAction : AnAction {
    constructor() : super()

    constructor(text: String?, description: String?) : super(text, description, null)

    // using main UI thread
    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.EDT
    }

    abstract fun getTextToInsert(): String

    abstract fun getActionName(): String

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
                    document.insertString(caret.offset, getTextToInsert())
                }
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}