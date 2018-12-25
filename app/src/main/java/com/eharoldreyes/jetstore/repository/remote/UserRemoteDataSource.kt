package com.eharoldreyes.jetstore.repository.remote

import androidx.lifecycle.LiveData
import com.eharoldreyes.jetstore.repository.UserDataSource
import com.eharoldreyes.jetstore.repository.remote.api.ApiService
import androidx.lifecycle.MutableLiveData
import com.eharoldreyes.jetstore.models.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class UserRemoteDataSource : UserDataSource {

    @Inject
    lateinit var apiService: ApiService

    override fun getUsers(): LiveData<List<User>> {
        val data = MutableLiveData<List<User>>()

        apiService.getUsers().enqueue(object : Callback<List<User>> {

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                data.value = response.body()
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                //TODO add liveData with error
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

        return data
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
}