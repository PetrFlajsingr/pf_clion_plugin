package cz.petrflajsingr.nihil_clion_plugin.status_bar

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.StatusBarWidgetFactory
import com.intellij.openapi.wm.WidgetPresentation
import com.intellij.openapi.wm.WidgetPresentationDataContext
import com.intellij.openapi.wm.WidgetPresentationFactory
import kotlinx.coroutines.CoroutineScope

class NihilStatusBarWidgetFactory : StatusBarWidgetFactory, WidgetPresentationFactory {
    override fun getId() = "NihilStatusBarFactory"
    override fun getDisplayName() = "TEST DISPLAY NAME"
    override fun isAvailable(project: Project) = true // TODO: check if speculo is present?
    override fun createPresentation(context: WidgetPresentationDataContext, scope: CoroutineScope): WidgetPresentation {
        return SpeculoStatusBarWidgetPresentation(context, scope)
    }
}