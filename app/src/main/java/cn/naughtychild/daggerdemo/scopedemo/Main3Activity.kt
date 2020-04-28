package cn.naughtychild.daggerdemo.scopedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.naughtychild.daggerdemo.App
import cn.naughtychild.daggerdemo.R
import javax.inject.Inject

class Main3Activity : AppCompatActivity() {
    @Inject
    lateinit var singleClass: SingleClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        (App.getContext(this) as App).getComponent().inject(this)
        singleClass.singleText()
    }
}