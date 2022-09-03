package com.richardson.dev.businesscard.model


data class BusinessCardEntity(
    val id: Int = 0,
    val name:String,
    val contact:String,
    val email:String,
    val company:String
)