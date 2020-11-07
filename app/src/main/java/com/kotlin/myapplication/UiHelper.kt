package com.kotlin.myapplication

import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class UiHelper {

    companion object{
        fun toolBarInit(activity:AppCompatActivity, view : View){

            var toolBar : Toolbar = view as Toolbar
            activity.setSupportActionBar(toolBar)
            activity.supportActionBar?.run {
                setDisplayHomeAsUpEnabled(false)
                setDisplayShowTitleEnabled(false)
            }
        }

        fun hideWindow(activity: AppCompatActivity){
            activity.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
    }
}