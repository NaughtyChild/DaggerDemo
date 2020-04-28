package cn.naughtychild.daggerdemo.scopedemo

import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class SingleScope {
}