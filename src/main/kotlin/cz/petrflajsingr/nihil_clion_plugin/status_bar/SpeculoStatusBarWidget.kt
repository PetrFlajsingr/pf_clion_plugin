package cz.petrflajsingr.nihil_clion_plugin.status_bar

import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.wm.TextWidgetPresentation
import com.intellij.openapi.wm.WidgetPresentationDataContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.awt.event.MouseEvent
import java.io.File

// TODO: add icon
class SpeculoStatusBarWidgetPresentation(
    private val dataContext: WidgetPresentationDataContext,
    scope: CoroutineScope
) : TextWidgetPresentation {
    override fun text(): Flow<String?> = flow {
        while (true) {
            val t = if (File(getFilePath()).exists()) {
                "Speculo paused"
            } else {
                "Speculo active"
            }
            emit(t)
        }
    }

    override val alignment: Float
        get() = 0.0f

    override suspend fun getTooltipText() = if (File(getFilePath()).exists()) {
        "Click to pause Speculo"
    } else {
        "Click to unpause Speculo"
    }

    override fun getClickConsumer() = fun(e: MouseEvent) {
        if (e.button == 1 && e.clickCount == 1) {
            val file = File(getFilePath())
            if (!File(getFilePath()).exists()) {
                file.writeText("")
            } else {
                file.delete()
            }
        }
    }

    private fun getFilePath(): String {
        val project = ProjectManager.getInstance().openProjects[0]
        val projectRoot = project.basePath
        return "$projectRoot./codegen_tool/Release/bin/pause_speculo"
    }
}
