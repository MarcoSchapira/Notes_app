package com.example.basicviewsapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class add_note : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_note)

        val save_button = findViewById<Button>(R.id.save_note_button)
        save_button.setOnClickListener { //view ->

            val inputTextTitle = findViewById<EditText>(R.id.inputTextTitle)
            val inputTextBody = findViewById<EditText>(R.id.inputTextBody)

            //create instance of a note and save it to the SQLite database
            val new_note_obj = note_object(inputTextTitle.text.toString(), inputTextBody.text.toString(), false)

            Snackbar.make(save_button, inputTextTitle.text.toString(), Snackbar.LENGTH_LONG)
            .setAnchorView(R.id.save_note_button)
            .setAction("Action", null).show()
        }
    }

}