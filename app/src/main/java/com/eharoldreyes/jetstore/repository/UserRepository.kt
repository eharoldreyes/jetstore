package com.eharoldreyes.jetstore.repository

import androidx.lifecycle.LiveData
import com.eharoldreyes.jetstore.models.User
import com.eharoldreyes.jetstore.repository.local.UserLocalDataSource
import com.eharoldreyes.jetstore.repository.remote.UserRemoteDataSource

class UserRepository(
    val localDataSource: UserLocalDataSource,
    val remoteDataSource: UserRemoteDataSource
) : UserDataSource {

    override fun getUsers(): LiveData<List<User>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUserById(id: String): LiveData<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insertUser(user: User): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteUser(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {

        private var INSTANCE: UserRepository? = null

        fun getInstance(localDataSource: UserLocalDataSource, remoteDataSource: UserRemoteDataSource): UserRepository =
            INSTANCE ?: UserRepository(localDataSource, remoteDataSource)
                .apply { INSTANCE = this }

    }

}