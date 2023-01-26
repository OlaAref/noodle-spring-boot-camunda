package com.olaaref.noodles.workflow.dto

data class NoodleApplicationDto(
    val id: Long,
    val customerName: String?,
    val step: String?,
    val status: String?
) {

}
