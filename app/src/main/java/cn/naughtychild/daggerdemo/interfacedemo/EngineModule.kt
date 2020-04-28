package cn.naughtychild.daggerdemo.interfacedemo

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class EngineModule {
    @Provides
    @One
    fun getOneEngine(): Engine {
        return OneEngine()
    }

    @Provides
    @Two
    fun getTwoEngine(): Engine {
        return TwoEngine()
    }
}