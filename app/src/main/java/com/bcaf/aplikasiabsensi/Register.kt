package com.bcaf.aplikasiabsensi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Get references to the EditText fields
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextAddress = findViewById<EditText>(R.id.editTextAddress)

        // Get reference to the Save button
        val btnSave = findViewById<Button>(R.id.btnSave)

        // Set OnClickListener for the Save button
        btnSave.setOnClickListener {
            // Get the text input from the EditText fields
            val name = editTextName.text.toString()
            val password = editTextPassword.text.toString()
            val email = editTextEmail.text.toString()
            val address = editTextAddress.text.toString()

            // Display the input values using a Toast message
            val message = "Name: $name\nPassword: $password\nEmail: $email\nAddress: $address"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
