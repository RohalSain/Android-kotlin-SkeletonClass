package com.example.rohal.singletonclass

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dataget.*
import android.content.Intent



class dataget : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dataget)
        var third=Singleton.instance
        name.text=third.b
        third.b="Saini"
        sendData.setOnClickListener {
            val returnIntent = Intent()
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

    }
}
