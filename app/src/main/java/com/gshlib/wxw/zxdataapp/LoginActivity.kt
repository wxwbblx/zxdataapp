package com.gshlib.wxw.zxdataapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

//,View.OnClickListener
class LoginActivity : AppCompatActivity() {

   /* var timeTextView:TextView?=null
    var container:LinearLayout?=null*/

    var login_user:EditText?=null
    var login_pwd:EditText?=null
    var login_chxpwd:CheckBox?=null
    var login_but:Button?=null

     //val TAG:String="LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_user=findViewById(R.id.login_user) as EditText
        login_pwd=findViewById(R.id.login_pwd)as EditText
        login_chxpwd=findViewById(R.id.login_chxpwd) as CheckBox
        login_but=findViewById(R.id.login_but) as Button

        login_chxpwd!!.isChecked=true


      /*  timeTextView=findViewById(R.id.timeTextView) as TextView
        var test:String="asdfasdfasdfasdf"*/
    }

     fun  loginOnClick(view: View) {
        Log.e("asdfasdfasdf","user login ")


    }
    fun

   /* override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.login_but-> Toast.makeText(this,"登录",Toast.LENGTH_LONG).show()
                R.id.login_user->Toast.makeText(this,"用户名",Toast.LENGTH_LONG).show()

            }
        }
        Toast.makeText(this,"HAHAH",Toast.LENGTH_LONG).show()
    }*/

   /* fun showTime(view: View){
        val dataFormatter=SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val str=dataFormatter.format(Date())
        timeTextView!!.text=str
    }*/
}
