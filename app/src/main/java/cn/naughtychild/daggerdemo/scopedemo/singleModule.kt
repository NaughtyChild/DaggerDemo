package cn.naughtychild.daggerdemo.scopedemo

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SingleModule {
    @Provides
    @SingleScope
    fun getSingle(): SingleClass {
        return SingleClass()
    }
}