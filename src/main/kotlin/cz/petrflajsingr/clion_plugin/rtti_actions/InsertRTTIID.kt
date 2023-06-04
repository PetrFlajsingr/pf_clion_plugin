package cz.petrflajsingr.clion_plugin.rtti_actions

import cz.petrflajsingr.clion_plugin.base_actions.InsertOrOverwriteTextAction
import cz.petrflajsingr.clion_plugin.generateRandomRTTIID

class InsertRTTIID : InsertOrOverwriteTextAction {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description)

    override fun getTextToInsert() = "InsertRTIITypeID"

    override fun getActionName() = generateRandomRTTIID()
}