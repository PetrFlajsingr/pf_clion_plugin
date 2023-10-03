package cz.petrflajsingr.nihil_clion_plugin.uuid_actions

import cz.petrflajsingr.nihil_clion_plugin.base_actions.InsertTextAction
import java.util.*

class InsertUUIDAction : InsertTextAction() {
    override val textToInsert get() = """"%s"""".format(UUID.randomUUID().toString())
    override val actionName get() = "InsertUUID"
}