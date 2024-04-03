package com.example.myapp

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ContactActivity() : AppCompatActivity() {
    val list = mutableListOf<Contact>()

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.contact_list_layout);

        val edtName = findViewById<EditText>(R.id.edtName);
        val edtPhone = findViewById<EditText>(R.id.edtPhone);
        val edtEmail = findViewById<EditText>(R.id.edtEmail);
        val btnSave = findViewById<Button>(R.id.btnSave);
        val listContact = findViewById<ListView>(R.id.lstContact);

        val adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        listContact.adapter = adapter

        btnSave.setOnClickListener{
            val c1 = Contact(
                edtName.text.toString(),
                edtPhone.text.toString(),
                edtEmail.text.toString()
            )
            list.add(c1);
            adapter.clear()
            for (contato in list){
                adapter.add(contato.toString())
            }
            Log.i("AGENDA CONTATO", "Lista: ${list}");
        }

    }
}