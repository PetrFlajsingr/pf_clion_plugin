package cz.petrflajsingr.clion_plugin.assert_actions

import cz.petrflajsingr.clion_plugin.base_actions.InsertOrOverwriteTextAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID


class InsertHexIdAction : InsertOrOverwriteTextAction {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description)

    override fun getTextToInsert() = generateRandomAssertID()
    override fun getActionName() = "InsertID"

}