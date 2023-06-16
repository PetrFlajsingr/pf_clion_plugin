package cz.petrflajsingr.clion_plugin

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.actionSystem.DefaultActionGroup

class MainMenuActionGroup : DefaultActionGroup() {
    // using main UI thread
    override fun getActionUpdateThread() = ActionUpdateThread.EDT
    override fun update(event: AnActionEvent) {
        // Enable/disable depending on whether user is editing
        val editor = event.getData(CommonDataKeys.EDITOR)
        //event.presentation.isEnabled = editor != null
        event.presentation.isEnabled = true
    }
}