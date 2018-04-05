package com.example.rohal.singletonclass

import android.widget.Toast
import android.content.Intent
import android.content.BroadcastReceiver
import android.content.Context


/**
 * Created by rohal on 9/3/18.
 */
class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when this BroadcastReceiver receives an Intent broadcast.
        Toast.makeText(context, "Action: " + intent.action!!, Toast.LENGTH_SHORT).show()
    }

}