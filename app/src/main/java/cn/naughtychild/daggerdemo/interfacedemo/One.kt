package cn.naughtychild.daggerdemo.interfacedemo

import javax.inject.Qualifier

@Qualifier
@Retention(value = AnnotationRetention.RUNTIME)
annotation class One {
}

@Qualifier
@Retention(value = AnnotationRetention.RUNTIME)
annotation class Two {
}
