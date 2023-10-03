package cz.petrflajsingr.nihil_clion_plugin.assert_actions

import cz.petrflajsingr.nihil_clion_plugin.base_actions.InsertTextAction
import cz.petrflajsingr.nihil_clion_plugin.generateRandomAssertID

class InsertStaticAssertAction : InsertTextAction() {
    override val textToInsert get() = """NIHIL_STATIC_ASSERT(%s, EXPRESSION, "");""".format(generateRandomAssertID())
    override val actionName get() = "InsertStaticAssert"
}