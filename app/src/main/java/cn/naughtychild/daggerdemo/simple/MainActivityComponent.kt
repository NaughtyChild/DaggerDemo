package cn.naughtychild.daggerdemo.simple

import cn.naughtychild.daggerdemo.MainActivity
import cn.naughtychild.daggerdemo.interfacedemo.EngineModule
import cn.naughtychild.daggerdemo.third.ThirdModule
import dagger.Component

@Component(modules = [ThirdModule::class,EngineModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}