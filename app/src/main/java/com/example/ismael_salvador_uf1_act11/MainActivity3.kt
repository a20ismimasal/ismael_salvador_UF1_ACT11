package com.example.ismael_salvador_uf1_act11


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    private var editTextName: EditText? = null
    private var editTextSurname: EditText? = null
    private var editTextAge: EditText? = null
    private var editTextPhone: EditText? = null
    private var editTextEmail: EditText? = null
    private var editTextUsername: EditText? = null
    private var editTextPassword: EditText? = null
    private var radioGroupGender: RadioGroup? = null
    private var radioButtonMale: RadioButton? = null
    private var radioButtonFemale: RadioButton? = null
    private var buttonSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextSurname = findViewById(R.id.editTextSurname)
        editTextAge = findViewById(R.id.editTextAge)
        editTextPhone = findViewById(R.id.editTextPhone)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        radioGroupGender = findViewById(R.id.radioGroupGender)
        radioButtonMale = findViewById(R.id.radioButtonMale)
        radioButtonFemale = findViewById(R.id.radioButtonFemale)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit?.setOnClickListener {
            val name = editTextName?.text.toString()
            val surname = editTextSurname?.text.toString()
            val age = editTextAge?.text.toString()
            val phone = editTextPhone?.text.toString()
            val email = editTextEmail?.text.toString()
            val username = editTextUsername?.text.toString()
            val password = editTextPassword?.text.toString()
            val gender = if (radioButtonMale?.isChecked == true) "Male" else "Female"

            Toast.makeText(this, "Registro completat: $name $surname, $gender", Toast.LENGTH_SHORT).show()
        }
    }
}
