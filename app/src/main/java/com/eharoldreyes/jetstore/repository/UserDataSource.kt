package com.eharoldreyes.jetstore.repository

import androidx.lifecycle.LiveData
import com.eharoldreyes.jetstore.models.User

interface UserDataSource {

    fun getUsers(): LiveData<List<User>>

    fun getUserById(id: String): LiveData<User>

    fun insertUser(user: User): String

    fun deleteUser(id: String)

}