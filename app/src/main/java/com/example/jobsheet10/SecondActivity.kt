package com.example.jobsheet10

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)

        val intent = intent
        textView1.text = intent.getStringExtra("text1")
        textView2.text = intent.getStringExtra("text2")
        textView3.text = intent.getStringExtra("text3")
    }
}