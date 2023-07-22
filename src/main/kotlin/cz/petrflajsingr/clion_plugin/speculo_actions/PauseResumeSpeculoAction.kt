package cz.petrflajsingr.clion_plugin.speculo_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.ProjectManager
import cz.petrflajsingr.clion_plugin.base_actions.ModifyFileAction
import cz.petrflajsingr.clion_plugin.base_actions.ModifyFileActionType
import java.io.File

class PauseResumeSpeculoAction : ModifyFileAction() {
    override fun getFileContent() = ""

    override fun getFilePath(): String {
        val project = ProjectManager.getInstance().openProjects[0]
        val projectRoot = project.basePath
        return "$projectRoot./codegen_tool/Release/bin/pause_speculo"
    }

    override fun getActionType() = if (File(getFilePath()).exists()) {
        ModifyFileActionType.Remove
    } else {
        ModifyFileActionType.Create
    }

    override fun getActionName() = "PauseResumeSpeculo"

    override fun update(e: AnActionEvent) {
        super.update(e)
        if (File(getFilePath()).exists()) {
            e.presentation.text = "Resume Speculo"
        } else {
            e.presentation.text = "Pause Speculo"
        }
    }
}