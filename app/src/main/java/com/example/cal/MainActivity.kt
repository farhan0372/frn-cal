package com.example.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spineer=findViewById<Spinner>(R.id.spinner1)
        val edt1=findViewById<EditText>(R.id.edt_number1)
        val edt2=findViewById<EditText>(R.id.edt_number2)
        val btn=findViewById<Button>(R.id.btn_submit)
        val list= arrayOf("*","%","-","+")


        val adapter=ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list)
        spineer.adapter=adapter

        btn.setOnClickListener {
            val select = list.get(spineer.selectedItemPosition)
            if (select == "*") {

                val final = edt1.text.toString().toInt() * edt2.text.toString().toInt()
                Toast.makeText(this, final.toString(), Toast.LENGTH_SHORT).show()

            } else if (select == "%") {

                val final = edt1.text.toString().toInt() / edt2.text.toString().toInt()
                Toast.makeText(this, final.toString(), Toast.LENGTH_SHORT).show()
            } else if (select == "-") {

                val final = edt1.text.toString().toInt() - edt2.text.toString().toInt()
                Toast.makeText(this, final.toString(), Toast.LENGTH_SHORT).show()
            } else if (select == "+") {

                val final = edt1.text.toString().toInt() + edt2.text.toString().toInt()
                Toast.makeText(this, final.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }
}