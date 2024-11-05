package com.example.nothesaplama

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Button=findViewById<Button>(R.id.button)
        val sonuc=findViewById<TextView>(R.id.textView)
        val midterm=findViewById<EditText>(R.id.editTextNumber)
        val fınal=findViewById<EditText>(R.id.editTextNumber2)
        Button.setOnClickListener {
            val midterm_not=midterm.text.toString().toDoubleOrNull()
            val fınal_not=fınal.text.toString().toDoubleOrNull()
            if (midterm_not != null && fınal_not != null){
                val ortalama = (midterm_not*0.4)+(fınal_not*0.6)
                sonuc.text=ortalama.toString()
            }
        }
    }
}