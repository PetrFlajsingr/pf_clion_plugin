package cz.petrflajsingr.clion_plugin

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.project.DumbAware

class MainMenuActionGroup : DefaultActionGroup(), DumbAware {
    // using main UI thread
    override fun getActionUpdateThread() = ActionUpdateThread.EDT
}