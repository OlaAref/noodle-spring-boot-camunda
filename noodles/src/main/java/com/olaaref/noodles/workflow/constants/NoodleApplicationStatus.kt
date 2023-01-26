package com.olaaref.noodles.workflow.constants

enum class NoodleApplicationStatus(desc: String) {
    VALIDATION("Validate the ingredients and tools"),
    COOKING("Cooking is in progress"),
    COOKED("The cooking is finished"),
    BURNED("Ingredients are burned"),
    EATING("Eating the noodles"),
    ORDER_ONLINE("Order noodles online")
}