package ru.samsung.itacademy.task2165

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.show)
        val editText = findViewById<EditText>(R.id.editText)
        val radioGroup = findViewById<RadioGroup>(R.id.radio)
        val hex = findViewById<RadioButton>(R.id.hex)
        val oct = findViewById<RadioButton>(R.id.oct)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                var msg = editText.text.toString()
                var i = msg.toInt()
                var h = Integer.toHexString(i)
                var o = Integer.toOctalString(i)

                if(hex.isChecked){
                    Toast.makeText(applicationContext, h, Toast.LENGTH_LONG).show()
                }
                else {
                    Toast.makeText(applicationContext, o, Toast.LENGTH_LONG).show()
                }
            }

        })
    }
}