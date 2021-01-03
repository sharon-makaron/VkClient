package com.sharonovnik.vkclient.ui.di.components

import android.content.Context
import android.content.SharedPreferences
import com.sharonovnik.vkclient.data.network.TokenInterceptor
import com.sharonovnik.vkclient.ui.VKLoginActivity
import com.sharonovnik.vkclient.ui.di.modules.AppModule
import com.sharonovnik.vkclient.ui.di.scopes.AppScope
import dagger.Component

@Component(modules = [AppModule::class])
@AppScope
interface AppComponent {
    fun inject(loginActivity: VKLoginActivity)
    fun sharedPrefs(): SharedPreferences
    fun context(): Context
    fun tokenInterceptor(): TokenInterceptor
}