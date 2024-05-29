package com.example.kotlinpractice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)

        var spinereg:Spinner=findViewById(R.id.spinereg)
        val listitem= listOf("Select option","Pratima","sushma","Shailes","Klesh","Diya","Arushi")
        var adapter=ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,listitem)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinereg.adapter=adapter


        spinereg.onItemSelectedListener=object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selecteditem=parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@spinner, "you have selected $selecteditem", Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        var alertdailog:Button=findViewById(R.id.alertdailog)
        alertdailog.setOnClickListener {
            showlaetdailogbox()
        }



        var customalertdailog:Button=findViewById(R.id.customalertdailog)
        customalertdailog.setOnClickListener {
            customealertdailogapperars()
        }

        var frgamentdemoeg:AppCompatButton=findViewById(R.id.frgamentdemoeg)
        frgamentdemoeg.setOnClickListener{
            var i =Intent(this,fragmentdemo::class.java)
            startActivity(i)
        }
    }

    fun showlaetdailogbox()
    {
        val builder=AlertDialog.Builder(this)
        builder.setTitle("Snapchat")
            .setMessage("do you want to uninstall")
            .setPositiveButton("Yes"){ dailog,which ->
                Toast.makeText(this,"Yoy have successfully installrd",Toast.LENGTH_LONG).show()

            }
            .setNegativeButton("No"){dailog, which ->
                dailog.dismiss()

            }

        builder.show()

    }

   fun customealertdailogapperars(){
       val builder=AlertDialog.Builder(this)
       builder.setTitle("Snapchat")

           .setMessage("do you want to uninstall")
           val getview=layoutInflater.inflate(R.layout.custom_alertlayout,null)
       builder.setView(getview)


           .setPositiveButton("Yes"){dailog, which ->
               Toast.makeText(this,"you have succesfully installed",Toast.LENGTH_LONG).show()
           }
           .setNegativeButton("No"){
               dailog,which ->
               dailog.dismiss()
           }
           .setCancelable(false)
       builder.show()
   }
}