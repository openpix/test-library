package com.pix.testjcenterlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.openpix.testlibrary.TestLibrary
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_version.text = TestLibrary.VERSION
    }
}