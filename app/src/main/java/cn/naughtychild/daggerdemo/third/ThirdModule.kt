package cn.naughtychild.daggerdemo.third

import dagger.Module
import dagger.Provides

@Module
class ThirdModule {
    @Provides
    fun getThird():Third {
        return  Third()
    }
}