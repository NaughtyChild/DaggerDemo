package cn.naughtychild.daggerdemo.interfacedemo

import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(@Two private val engine: Engine) {
    fun run(): String {
        return engine.work()
    }
}