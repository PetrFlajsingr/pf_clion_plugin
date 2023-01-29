package cz.petrflajsingr.clion_plugin.uuid_actions

import cz.petrflajsingr.clion_plugin.base_actions.InsertTextAction
import java.util.*

class InsertUUIDAction : InsertTextAction() {
    override fun getTextToInsert(): String {
        return """"%s"""".format(UUID.randomUUID().toString())
    }

    override fun getActionName(): String {
        return "InsertUUID"
    }
}