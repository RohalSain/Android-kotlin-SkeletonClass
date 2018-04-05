package com.example.rohal.singletonclass

import android.app.Activity
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_broadcaster.*
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yes.setOnClickListener {
            val i = Intent("my.local.intent")
            LocalBroadcastManager.getInstance(it.context).sendBroadcast(i);
            var name=nameget.text
            var first = Singleton.instance
            first.b =name.toString()
            Log.d("data","${name}")
            var a:Intent= Intent(this,dataget::class.java);
            startActivityForResult(a,1);
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                Log.d("String","yes");
                var first = Singleton.instance
                nameget.setText("${first.b}",TextView.BufferType.EDITABLE)

            }
            if (resultCode == Activity.RESULT_CANCELED) {
            }
        }
    }//onActivityResult
    /*

    public override fun onRestart() {
        super.onRestart()
        finish()
        startActivity(intent)

    } */

}
