package cz.petrflajsingr.clion_plugin.assert_actions

import com.intellij.openapi.actionSystem.ActionUpdateThread
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import cz.petrflajsingr.clion_plugin.base_actions.InsertOrOverwriteTextAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID


class InsertHexIdAction : InsertOrOverwriteTextAction {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description)

    override fun getTextToInsert() = generateRandomAssertID()
    override fun getActionName() = "InsertID"

}