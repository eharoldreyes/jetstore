package com.eharoldreyes.jetstore.injection

import com.eharoldreyes.jetstore.injection.modules.NetworkModule
import com.eharoldreyes.jetstore.repository.remote.UserRemoteDataSource
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ApiInjector {

    fun inject(userRemoteDataSource: UserRemoteDataSource)

    interface Builder {

        fun build(): ApiInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }

}