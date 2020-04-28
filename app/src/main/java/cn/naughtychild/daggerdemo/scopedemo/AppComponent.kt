package cn.naughtychild.daggerdemo.scopedemo

import cn.naughtychild.daggerdemo.MainActivity
import dagger.Component

@SingleScope
@Component(modules = [SingleModule::class])
interface AppComponent {
    fun inject(activity: Main2Activity)
    fun inject(activity: Main3Activity)

}