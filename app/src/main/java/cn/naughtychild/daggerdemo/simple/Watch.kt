package cn.naughtychild.daggerdemo.simple

import android.util.Log
import javax.inject.Inject

class Watch @Inject constructor() {
    fun work() {
        Log.d("Watch", "work: dagger2,watch work");
    }
}