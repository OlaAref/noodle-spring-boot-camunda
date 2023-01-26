package com.olaaref.noodles.workflow.controller

import arrow.core.Either
import com.olaaref.noodles.workflow.dto.NoodleApplicationDto
import com.olaaref.noodles.workflow.exception.NoodleException
import com.olaaref.noodles.workflow.model.request.NoodleApplicationRequest
import com.olaaref.noodles.workflow.service.WorkflowService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/workflow")
class WorkflowController @Autowired constructor(private val workflowService: WorkflowService) {

    @GetMapping("/application")
    fun startApplication(@RequestBody applicationRequest: NoodleApplicationRequest): NoodleApplicationDto =
        workflowService.startWorkflowInstance("noodles_process", "1234", applicationRequest)

}