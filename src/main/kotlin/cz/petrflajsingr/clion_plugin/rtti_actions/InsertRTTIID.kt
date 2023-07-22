package cz.petrflajsingr.clion_plugin.rtti_actions

import com.intellij.openapi.project.DumbAware
import cz.petrflajsingr.clion_plugin.base_actions.InsertOrOverwriteTextAction
import cz.petrflajsingr.clion_plugin.generateRandomRTTIID

class InsertRTTIID : InsertOrOverwriteTextAction, DumbAware {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description)

    override fun getTextToInsert() = generateRandomRTTIID()

    override fun getActionName() = "InsertRTIITypeID"
}