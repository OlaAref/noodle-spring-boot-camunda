package com.olaaref.noodles.workflow.model.request

import arrow.core.Either
import com.olaaref.noodles.workflow.exception.NoodleException

data class NoodleApplicationRequest(val customerName: String,
                                    val NOODLES: Boolean,
                                    val ONION: Boolean,
                                    val TOMATO: Boolean,
                                    val CHEESE: Boolean,
                                    val PEPPER: Boolean,
                                    val CARROT: Boolean,
                                    val WATER: Boolean,
                                    val PAN: Boolean,
                                    val WOK: Boolean,
                                    val KNIFE: Boolean,
                                    val FORK: Boolean,
                                    val SPOON: Boolean,
                                    val CUTTING_BOARD: Boolean,
                                    val BOWL: Boolean,
                                    val SPATULA: Boolean){


}
