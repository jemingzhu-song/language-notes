package Playground.Enum_Deserialise

import java.lang.IllegalArgumentException

enum class DevOpsBuildState(val value: String) {
    PENDING("pending"),
    IN_PROGRESS("in_progress"),
    SUCCESSFUL("successful"),
    CANCELLED("cancelled"),
    FAILED("failed"),
    UNKNOWN("unknown");

    companion object {
        fun mapToEnum(value: String): DevOpsBuildState {
            try {
                return DevOpsBuildState.valueOf(value)
            } catch(e: IllegalArgumentException) {
                return UNKNOWN
            }
        }
    }
}

fun main() {
    val state1 = DevOpsBuildState.mapToEnum("successful")
    println(state1.value)
    println(state1)
}