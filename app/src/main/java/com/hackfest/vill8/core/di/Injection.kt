package com.hackfest.vill8.core.di

import android.content.Context
import com.hackfest.vill8.core.data.source.UserRepository
import com.hackfest.vill8.core.data.source.local.pref.UserPreference
import com.hackfest.vill8.core.data.source.local.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}