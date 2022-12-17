package cz.petrflajsingr.assert_integration

import kotlin.random.Random

fun generateRandomAssertID(): String {
    return "0x%017X_aID".format(Random.nextLong())
}