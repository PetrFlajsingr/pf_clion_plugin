package cz.petrflajsingr.nihil_clion_plugin

import com.intellij.openapi.util.Key
import cz.petrflajsingr.nihil_clion_plugin.debugger.DebuggerHandler

object DataKeys {

    val debuggerHandler = Key.create<DebuggerHandler>("DEBUGGER_HANDLER")
}