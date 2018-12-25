package com.eharoldreyes.jetstore.injection.modules

import com.eharoldreyes.jetstore.BuildConfig
import com.eharoldreyes.jetstore.repository.remote.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory


@Module
object NetworkModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideApiService(retrofit: Retrofit) =
        retrofit.create(ApiService::class.java)

    internal fun provideRetrofitInterface() =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
//                .addCallAdapterFactory(MoshiConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
//                .client()
            .build()
}