package cn.naughtychild.daggerdemo.scopedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.naughtychild.daggerdemo.App
import cn.naughtychild.daggerdemo.R
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {
    @Inject
    lateinit var singleClass1: SingleClass

    @Inject
    lateinit var singleClass2: SingleClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        (App.getContext(this) as App).getComponent().inject(this)
        singleClass1.singleText()
        singleClass2.singleText()
        button.setOnClickListener {
            Intent(this, Main3Activity::class.java).apply {
                startActivity(this)
            }
        }
    }
}