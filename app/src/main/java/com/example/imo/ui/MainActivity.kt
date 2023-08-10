package com.example.imo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.example.imo.R

class MainActivity : AppCompatActivity() {

    var isMain=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }
    fun openNext(){
        if (isMain){
            val intent= Intent(this, FriendsActivity::class.java)
            startActivity(intent)
            finish()
        }else{
            val intent=Intent(this, NumberActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun initViews() {
        Handler().postDelayed({
            openStartActivity()
        }, 2000)
    }

    private fun openStartActivity() {
        val intent = Intent(this, NumberActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun inetveiw(){
        val image= findViewById<ImageView>(R.id.iv_icon)


    }
}