package ru.samsung.itacademy.task2164

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<EditText>(R.id.editText)
        val toggle = findViewById<ToggleButton>(R.id.toggleButton)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                var msg: String = text.text.toString()
                if(toggle.isChecked) {
                    msg = msg + "1"
                    text.setText(msg)
                }else{
                    msg = msg + "0"
                    text.setText(msg)
                }

            }

        })
    }
}