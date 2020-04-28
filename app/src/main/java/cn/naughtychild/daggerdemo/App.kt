package cn.naughtychild.daggerdemo

import android.app.Application
import android.content.Context
import cn.naughtychild.daggerdemo.scopedemo.AppComponent
import cn.naughtychild.daggerdemo.scopedemo.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    fun getComponent(): AppComponent {
        return appComponent
    }

    companion object {
        fun getContext(context: Context): Context {
            return context.applicationContext
        }
    }
}