package cz.petrflajsingr.clion_plugin.assert_actions

import cz.petrflajsingr.clion_plugin.base_actions.InsertTextAction
import cz.petrflajsingr.clion_plugin.generateRandomAssertID

class InsertStaticAssertAction : InsertTextAction() {
    override fun getTextToInsert() = """NIHIL_STATIC_ASSERT(%s, EXPRESSION, "");""".format(generateRandomAssertID())
    override fun getActionName() = "InsertStaticAssert"
}