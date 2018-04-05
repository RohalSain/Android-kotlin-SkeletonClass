package com.example.rohal.singletonclass

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_broadcaster.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import android.widget.Toast
import android.support.v4.content.LocalBroadcastManager
import android.content.IntentFilter





class Broad : AppCompatActivity(){
    private val the_receiver = object : BroadcastReceiver() {

        override fun onReceive(c: Context, i: Intent) {
            Toast.makeText(getApplicationContext(), "Message", Toast.LENGTH_SHORT);
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcaster)
    }

}
