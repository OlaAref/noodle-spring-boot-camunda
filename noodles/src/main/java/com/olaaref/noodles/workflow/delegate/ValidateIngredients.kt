package com.olaaref.noodles.workflow.delegate

import arrow.core.Either
import com.olaaref.noodles.workflow.exception.NoodleException
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Service

@Service
class ValidateIngredients: JavaDelegate {

    override fun execute(execution: DelegateExecution?) {
        when(false){
            execution?.getVariable("NOODLES"),
            execution?.getVariable("WATER"),
            execution?.getVariable("PAN"),
            execution?.getVariable("SPATULA"),
            execution?.getVariable("FORK"),-> execution?.setVariable("IngredientsAvailable", false)
            else -> execution?.setVariable("IngredientsAvailable", true)
        }

    }
}