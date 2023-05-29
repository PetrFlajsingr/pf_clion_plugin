package cz.petrflajsingr.clion_plugin

import kotlin.random.Random

fun generateRandomAssertID() = "0x%08X".format(Random.nextInt())