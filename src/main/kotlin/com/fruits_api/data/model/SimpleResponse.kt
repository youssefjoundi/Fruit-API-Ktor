package com.fruits_api.data.model

import kotlinx.serialization.Serializable

@Serializable
data class SimpleResponse(
    val successful: Boolean,
    val message: String
)