package cz.petrflajsingr.assert_integration.pf_assert_integration

import kotlin.random.Random

fun generateRandomHexString(): String {
    return "0x%08X".format(Random.nextInt())
}