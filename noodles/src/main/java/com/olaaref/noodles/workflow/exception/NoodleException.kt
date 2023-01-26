package com.olaaref.noodles.workflow.exception

sealed class NoodleException{
    object ToolMissingException: NoodleException()
    object NoodlesOrWaterMissingException: NoodleException()
}
