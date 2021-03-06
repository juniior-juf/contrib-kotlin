package com.example.contribmontano

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object GithubFactory {
    private const val BASE_URL = "https://api.github.com/"

    fun makeGithubService(): GithubService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(GithubService::class.java)
}