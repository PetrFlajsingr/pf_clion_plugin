package cz.petrflajsingr.nihil_clion_plugin.speculo_actions

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.ProjectManager
import cz.petrflajsingr.nihil_clion_plugin.base_actions.ModifyFileAction
import cz.petrflajsingr.nihil_clion_plugin.base_actions.ModifyFileActionType
import java.io.File

class PauseResumeSpeculoAction : ModifyFileAction() {
    override val fileContent get() = ""

    override val filePath: String
        get() {
            val project = ProjectManager.getInstance().openProjects[0]
            val projectRoot = project.basePath
            return "$projectRoot./codegen_tool/Release/bin/pause_speculo"
        }

    override val actionType
        get() = if (File(filePath).exists()) {
            ModifyFileActionType.Remove
        } else {
            ModifyFileActionType.Create
        }

    override val actionName get() = "PauseResumeSpeculo"

    override fun update(e: AnActionEvent) {
        super.update(e)
        if (File(filePath).exists()) {
            e.presentation.text = "Resume Speculo"
        } else {
            e.presentation.text = "Pause Speculo"
        }
    }
}