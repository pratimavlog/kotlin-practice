package com.example.kotlinpractice

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listvieweg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listvieweg)


        var listveiwdemo:ListView=findViewById(R.id.listveiwdemo)
        val listitems= arrayOf("Read a book",
            "create a Project",
            "Learn kotlin",
            "Go for shopping",
            "Attend the seminor")

        val listAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,listitems)
        listveiwdemo.adapter=listAdapter

listveiwdemo.setOnItemClickListener { parent, view, position, id ->
    val seleteditem=parent.getItemAtPosition(position) as String
    Toast.makeText(this,"You have selected "+ seleteditem,Toast.LENGTH_LONG).show()
}
    }
}