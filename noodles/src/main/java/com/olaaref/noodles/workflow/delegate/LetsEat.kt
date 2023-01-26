package com.olaaref.noodles.workflow.delegate

import com.olaaref.noodles.workflow.constants.NoodleApplicationStatus
import com.olaaref.noodles.workflow.constants.NoodleApplicationStep
import com.olaaref.noodles.workflow.model.NoodleApplication
import com.olaaref.noodles.workflow.repository.NoodlesRepository
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LetsEat @Autowired constructor(val noodlesRepository: NoodlesRepository): JavaDelegate  {

    private val logger = LoggerFactory.getLogger(LetsEat::class.java)

    override fun execute(execution: DelegateExecution?) {
        noodlesRepository.save(NoodleApplication(
            id = execution?.getVariable("applicationId") as Long?,
            step = NoodleApplicationStep.EATING_SERVICE.name,
            status = NoodleApplicationStatus.EATING.name,
            customerName = execution?.getVariable("customerName") as String?
        ))
        logger.info("====== > The application is in the eating step.")
    }
}