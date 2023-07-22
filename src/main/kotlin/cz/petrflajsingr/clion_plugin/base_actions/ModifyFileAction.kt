package cz.petrflajsingr.clion_plugin.base_actions

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAware
import java.io.File


enum class ModifyFileActionType {
    Create, Remove
}

abstract class ModifyFileAction : AnAction, DumbAware {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description, null)

    // using main UI thread
    override fun getActionUpdateThread() = ActionUpdateThread.EDT
    abstract fun getFileContent(): String
    abstract fun getFilePath(): String
    abstract fun getActionType(): ModifyFileActionType
    abstract fun getActionName(): String
    override fun actionPerformed(event: AnActionEvent) {
        val file = File(getFilePath())
        if (getActionType() == ModifyFileActionType.Create) {
            file.writeText(getFileContent())
        } else if (getActionType() == ModifyFileActionType.Remove) {
            if (file.exists()) {
                file.delete()
            }
        }
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}