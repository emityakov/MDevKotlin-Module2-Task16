package ru.samsung.itacademy.task2162

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.text)
        val italic = findViewById<CheckBox>(R.id.italic)
        val bold = findViewById<CheckBox>(R.id.bold)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val msg = text.text.toString()
                if(italic.isChecked && bold.isChecked){
                    text.setTypeface(null, Typeface.BOLD_ITALIC)
                }
                else if(italic.isChecked && !bold.isChecked){
                    text.setTypeface(null, Typeface.ITALIC)
                }
                else if(!italic.isChecked && bold.isChecked){
                    text.setTypeface(null, Typeface.BOLD)
                }
                else{
                    text.setTypeface(Typeface.DEFAULT)
                }

                text.setText(msg)
            }

        })

    }
}