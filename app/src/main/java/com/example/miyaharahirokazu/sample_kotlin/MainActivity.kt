package com.example.miyaharahirokazu.sample_kotlin

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


public class MainActivity : Activity() {

    var nameEditText:EditText? = null
    var submitButton:Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_edit_Text)as EditText

        submitButton = findViewById(R.id.submit_button)as Button

        submitButton!!.setOnClickListener({
            val name = nameEditText?.getText().toString()
            try {
                val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse(name))
                startActivity(intent)
            } catch(e:Exception) {
                    Toast.makeText(this,"Please input URL",Toast.LENGTH_SHORT).show()
            }
        })
    }
}
