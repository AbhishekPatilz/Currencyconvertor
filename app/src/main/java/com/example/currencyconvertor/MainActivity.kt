package com.example.currencyconvertor

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edt: EditText = findViewById(R.id.edt)
        val btnR: Button = findViewById(R.id.btn_Rup)
        val btnD: Button = findViewById(R.id.btn_Dol)
        val convertedText: TextView = findViewById(R.id.txtv)

        btnR.setOnClickListener {
            val amount = edt.text.toString().toInt()
            val RupeeAmount = 83.15*amount
            convertedText.text = "Converted amount:$RupeeAmount"

            btnD.setOnClickListener {
                val amount = edt.text.toString().toInt()
                val DollerAmount = amount/83.15
                convertedText.text = "Converted amount:$DollerAmount"
            }
        }
        }
    }