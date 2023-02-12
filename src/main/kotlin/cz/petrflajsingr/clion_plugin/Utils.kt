package cz.petrflajsingr.clion_plugin

import kotlin.random.Random

fun generateRandomAssertID(): String {
    return "0x%017X".format(Random.nextLong())
}