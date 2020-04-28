package cn.naughtychild.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cn.naughtychild.daggerdemo.interfacedemo.Car
import cn.naughtychild.daggerdemo.simple.DaggerMainActivityComponent
import cn.naughtychild.daggerdemo.simple.Watch
import cn.naughtychild.daggerdemo.third.Third
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var watch: Watch

    @Inject
    lateinit var third: Third

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerMainActivityComponent.create().inject(this)
        setContentView(R.layout.activity_main)
        watch.work()
        third.work()
        Log.d("MainActivity", "onCreate:${car.run()} ");
    }
}
