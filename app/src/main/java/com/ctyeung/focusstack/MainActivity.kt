package com.ctyeung.focusstack

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun combine(bmpIn1:Bitmap, bmpIn2: Bitmap, bmpOut: Bitmap):Int {
        return combineFromJNI(bmpIn1, bmpIn2, bmpOut)
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun combineFromJNI(bmpIn1: Bitmap,
                                bmpIn2:Bitmap,
                                bmpOut: Bitmap): Int

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}