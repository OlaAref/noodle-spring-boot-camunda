package com.olaaref.noodles.workflow.service



import com.olaaref.noodles.workflow.constants.NoodleApplicationStatus
import com.olaaref.noodles.workflow.constants.NoodleApplicationStep
import com.olaaref.noodles.workflow.dto.NoodleApplicationDto
import com.olaaref.noodles.workflow.model.NoodleApplication
import com.olaaref.noodles.workflow.model.request.NoodleApplicationRequest
import com.olaaref.noodles.workflow.repository.NoodlesRepository
import org.camunda.bpm.engine.RuntimeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class WorkflowService @Autowired constructor(private val runtimeService: RuntimeService,
                                             private val noodlesRepository: NoodlesRepository) {

    fun startWorkflowInstance(workflowKey: String, businessKey:String, noodleApplicationRequest: NoodleApplicationRequest): NoodleApplicationDto {

        val application = noodlesRepository.save(
            NoodleApplication(
                step = NoodleApplicationStep.INGREDIENTS_AND_TOOLS_VALIDATION.name,
                status = NoodleApplicationStatus.VALIDATION.name,
                customerName = noodleApplicationRequest.customerName
            )
        )

        val variables = mapOf("customerName" to noodleApplicationRequest.customerName,
            "NOODLES" to noodleApplicationRequest.NOODLES,
            "ONION" to noodleApplicationRequest.ONION,
            "TOMATO" to noodleApplicationRequest.TOMATO,
            "CHEESE" to noodleApplicationRequest.CHEESE,
            "PEPPER" to noodleApplicationRequest.PEPPER,
            "CARROT" to noodleApplicationRequest.CARROT,
            "WATER" to noodleApplicationRequest.WATER,
            "PAN" to noodleApplicationRequest.PAN,
            "WOK" to noodleApplicationRequest.WOK,
            "KNIFE" to noodleApplicationRequest.KNIFE,
            "FORK" to noodleApplicationRequest.FORK,
            "SPOON" to noodleApplicationRequest.SPOON,
            "CUTTING_BOARD" to noodleApplicationRequest.CUTTING_BOARD,
            "BOWL" to noodleApplicationRequest.BOWL,
            "SPATULA" to noodleApplicationRequest.SPATULA,
            "applicationId" to application.id
        )
        runtimeService.startProcessInstanceByKey(workflowKey, businessKey, variables)

        return application.toNoodleApplicationDto()
    }


}