package cz.petrflajsingr.nihil_clion_plugin.assert_actions

import cz.petrflajsingr.nihil_clion_plugin.base_actions.InsertOrOverwriteTextAction
import cz.petrflajsingr.nihil_clion_plugin.generateRandomAssertID


class InsertHexIdAction : InsertOrOverwriteTextAction {
    constructor() : super()
    constructor(text: String?, description: String?) : super(text, description)

    override val textToInsert get() = generateRandomAssertID()
    override val actionName get() = "InsertID"

}