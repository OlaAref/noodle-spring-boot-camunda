package com.olaaref.noodles.workflow.repository

import com.olaaref.noodles.workflow.model.NoodleApplication
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NoodlesRepository: JpaRepository<NoodleApplication, Long> {
}