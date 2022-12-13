package cz.petrflajsingr.assert_integration.pf_assert_integration

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction


abstract class InsertErrorActionBase : InsertTextActionBase() {

    abstract fun getErrorName(): String

    override fun getTextToInsert(): String {
        return """%s(%s, Log::, "");""".format(getErrorName(), generateRandomHexString())
    }

    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}