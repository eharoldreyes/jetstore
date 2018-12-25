package com.eharoldreyes.jetstore.repository.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.eharoldreyes.jetstore.models.User
import com.eharoldreyes.jetstore.repository.UserDataSource

@Dao
interface UserLocalDataSource : UserDataSource {

    @Query("SELECT * FROM users ORDER BY name")
    override fun getUsers(): LiveData<List<User>>

    @Query("SELECT * FROM users WHERE id = :id ORDER BY name")
    override fun getUserById(id: String): LiveData<User>

    override fun insertUser(user: User): String

    override fun deleteUser(id: String)

}