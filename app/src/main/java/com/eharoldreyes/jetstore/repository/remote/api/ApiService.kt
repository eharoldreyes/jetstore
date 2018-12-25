package com.eharoldreyes.jetstore.repository.remote.api

import com.eharoldreyes.jetstore.models.User
import com.eharoldreyes.jetstore.repository.remote.api.adapter.CallAdapter
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users")
    fun getUsers(): CallAdapter<List<User>>

    @GET("users/{id}")
    fun getUserById(@Path("id") id: String): CallAdapter<User>
}