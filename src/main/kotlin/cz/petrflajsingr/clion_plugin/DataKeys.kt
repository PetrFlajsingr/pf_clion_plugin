package cz.petrflajsingr.clion_plugin

import com.intellij.openapi.util.Key
import cz.petrflajsingr.clion_plugin.debugger.DebuggerHandler

object DataKeys {

    val debuggerHandler = Key.create<DebuggerHandler>("DEBUGGER_HANDLER")
}