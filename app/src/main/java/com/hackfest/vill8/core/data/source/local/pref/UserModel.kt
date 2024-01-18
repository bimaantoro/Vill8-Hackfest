package com.hackfest.vill8.core.data.source.local.pref

data class UserModel(
    val email: String,
    val token: String,
    val isLogin: Boolean = false
)