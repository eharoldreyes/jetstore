package com.eharoldreyes.jetstore.models.dto

data class BaseResponse<out T>(

    val status: String,
    val statusCode: Int,
    val message: String?,
    val data: T


) {

}