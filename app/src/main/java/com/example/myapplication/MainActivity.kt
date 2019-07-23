package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnDialer).setOnClickListener {
            Uri.parse("tel:87654321").let {
                Intent(Intent.ACTION_DIAL, it)
            }.let {
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.btnBrowser).setOnClickListener {
            val uri = Uri.parse("http://google.com")
            intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }
}
