package cz.petrflajsingr.nihil_clion_plugin.debugger

// TODO: GDB
// TODO: Linux vs Windows
interface DebuggerHandler {
    fun removeBreakpointInstruction(): Boolean
}