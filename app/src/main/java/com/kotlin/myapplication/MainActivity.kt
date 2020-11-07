package com.kotlin.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();

        mainRecyclerView.layoutManager
        
    }

    private fun init() {
        UiHelper.toolBarInit(this, mainToolbar)
        UiHelper.hideWindow(this)
    }
}