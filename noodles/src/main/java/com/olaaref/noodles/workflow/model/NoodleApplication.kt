package com.olaaref.noodles.workflow.model


import com.olaaref.noodles.workflow.dto.NoodleApplicationDto
import javax.persistence.*

@Entity
@Table(name = "noodles")
data class NoodleApplication(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = 0L,
                             @Column(name="customer_name") val customerName: String? = null,
                             @Column(name="step") val step: String? = null,
                             @Column(name="status") val status: String? = null) {

    fun toNoodleApplicationDto() = NoodleApplicationDto(id!!, customerName, step, status)
}
