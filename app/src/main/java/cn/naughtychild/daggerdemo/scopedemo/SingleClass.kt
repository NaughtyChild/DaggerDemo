package cn.naughtychild.daggerdemo.scopedemo

import android.util.Log
import javax.inject.Inject

class SingleClass @Inject constructor() {
    fun singleText() {
        Log.d("SingleClass", "singleText: ${this.hashCode()}");
    }
}