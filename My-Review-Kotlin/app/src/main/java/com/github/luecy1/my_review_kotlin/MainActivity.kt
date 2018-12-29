package com.github.luecy1.my_review_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val constraintLayout = findViewById<ConstraintLayout>(R.id.main_layout)



        // クリック時のイベント
        button.setOnClickListener {

//            val inputText = editText.text
//            Snackbar.make(constraintLayout,"こんにちは${inputText}さん",Snackbar.LENGTH_LONG).show()

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {

            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }

    }
}
