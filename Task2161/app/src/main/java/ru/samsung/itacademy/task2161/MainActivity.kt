package ru.samsung.itacademy.task2161

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val msg: String = editText.text.toString()
                if(msg.trim().length>0) {
                    Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext, "Empty", Toast.LENGTH_SHORT).show()
                }

            }

        })
    }
}