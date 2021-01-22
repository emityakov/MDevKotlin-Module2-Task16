package ru.samsung.itacademy.task2163

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val radioGroup = findViewById<RadioGroup>(R.id.languageGroup)
        val imageView = findViewById<ImageView>(R.id.image)
        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->

            val radio:RadioButton = group.findViewById(checkedId)
            if(radio.text.toString() == "Java"){
                imageView.setImageResource(R.drawable.java)
            }
            else{
                imageView.setImageResource(R.drawable.kotlin)
            }
        })

    }


}