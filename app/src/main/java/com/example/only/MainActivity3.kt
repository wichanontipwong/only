package com.example.only

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

var m = "n"
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button9 .setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(n,"ถูก")
            startActivity(intent)
        }
        button10 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button11 .setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(n,"ถูก")
            startActivity(intent)
        }
        button12 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
    }
}