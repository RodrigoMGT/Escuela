package com.example.p_movil_viernes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAceptar: Button
    private lateinit var editTextNombre: EditText
    private lateinit var editTextApellido: EditText
    private lateinit var editTextTelefono: EditText
    private lateinit var editTextCorreo: EditText
    private lateinit var imagenEstatus: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAceptar = findViewById(R.id.btnAcceptar)
        editTextNombre = findViewById(R.id.editText_Nombres)
        editTextApellido = findViewById(R.id.editText_Apellidos)
        editTextTelefono = findViewById(R.id.editText_Telefono)
        editTextCorreo = findViewById(R.id.editText_Correo)

        //5. Cuando el usuario pulse ACEPTAR, deberán existir los siguientes dos casos.
        btnAceptar.setOnClickListener(){
            val nombre = editTextNombre.text.toString()
            val apellido = editTextApellido.text.toString()
            val telefono = editTextTelefono.text.toString()
            val correo = editTextCorreo.text.toString()

            //a) Uno o todos los campos están vacíos: se mostrará una imagen con una paloma roja en señal de error de autenticación.
            if(nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty())
                imagenEstatus.setImageResource(R.drawable.paloma_roja)
            //a) Ningún campo está vacío: se mostrará una imagen con una palomita verde en señal de autenticación correcta.
            else
                imagenEstatus.setImageResource(R.drawable.paloma_verde)

            imagenEstatus.visibility = View.VISIBLE
            /*3.
            Cuando el usuario pulse el botón, este debe deshabilitarse (atributo enabled tipo booleano) y
            el texto debe hacerse invisible (atributo visibility con valores View.VISIBLE, View.INVISIBLE y View.GONE)
            */
            btnAceptar.isEnabled= false
            btnAceptar.visibility = View.INVISIBLE

        }

/*
        textView = findViewById(R.id.txt_textView)
        editText = findViewById(R.id.editText)
        editText2 = findViewById(R.id.editText2)
        editText.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(
                s: CharSequence?, start: Int,
                count: Int, after: Int) { }

            override fun onTextChanged(
                s: CharSequence?, start: Int,
                before: Int, count: Int) {
                textView.text = editText.text
            }
        })

*/
    }
}