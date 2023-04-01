package com.fruits_api.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Fruit(
    val name: String,
    val id: String
)
