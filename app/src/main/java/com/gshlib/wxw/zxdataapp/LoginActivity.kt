package com.gshlib.wxw.zxdataapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class LoginActivity : AppCompatActivity() {

    var timeTextView:TextView?=null
    var container:LinearLayout?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        timeTextView=findViewById(R.id.timeTextView) as TextView
        var test:string="asdfasdfasdfasdf"
    }

    fun showTime(view: View){
        val dataFormatter=SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val str=dataFormatter.format(Date())
        timeTextView!!.text=str
    }
}
