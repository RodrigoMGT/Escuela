package com.example.listayspinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var spinner: Spinner
    var paisSelect: Int = 0
    var pais = arrayOf("Mexcio","USA","Argentina","España","Brasil","Chile","Peru","Canada","Salvador",
        "India","Honduras","Colombia","Francia","Italia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.my_spinner)
        val itemsAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pais)
        spinner.adapter = itemsAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent:AdapterView<*>?){

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                paisSelect = position
                //Toast.makeText(applicationContext,pais[position],Toast.LENGTH_LONG).show()
            }
        }

        boton = findViewById(R.id.btn)
        boton.setOnClickListener() {
            Toast.makeText(applicationContext,"Bienvenida al pais de "+pais[paisSelect],Toast.LENGTH_LONG).show()
        }
    }
}