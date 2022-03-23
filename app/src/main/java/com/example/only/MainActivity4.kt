package com.example.only

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main4.*

var l = "n"
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button6 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button7 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button8 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(n,"ผิดดดด!!")
            startActivity(intent)
        }
        button13 .setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(n,"ถูก")
            startActivity(intent)
        }
    }
}