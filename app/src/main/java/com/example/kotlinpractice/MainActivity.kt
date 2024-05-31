package com.example.kotlinpractice

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerview:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        var Explicitbutton:Button=findViewById(R.id.Explicitbutton)
        var implicitbutton:Button=findViewById(R.id.implicitbutton)
        Explicitbutton.setOnClickListener {
            var intent= Intent(this,secondActivvity::class.java)
            startActivity(intent)
            finish()

        }
        var url="https://www.geeksforgeeks.org/kotlin-type-checking-and-smart-casting/?ref=lbp"
/*
        implicitbutton.setOnClickListener {
            var intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            finish()
        }


*/
        implicitbutton.setOnClickListener {
            val message=implicitbutton.text.toString()
            var intent=Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type="text/plan"
            startActivity(Intent.createChooser(intent,"Share to: "))
            finish()
        }

        var listviewclick:Button=findViewById(R.id.listviewclick)

        listviewclick.setOnClickListener {
            var i=Intent(this,listvieweg::class.java)
            startActivity(i)
        }

        var recyclervw:Button=findViewById(R.id.recyclervw)
        recyclervw.setOnClickListener {
            var i=Intent(this,recyclervieweg::class.java)
            startActivity(i)
        }

        spinnerview=findViewById(R.id.spinnerview)
        spinnerview.setOnClickListener{
            var i=Intent(this,spinner::class.java)
            startActivity(i)

        }

        var viewpageeg:Button=findViewById(R.id.viewpageeg)
        viewpageeg.setOnClickListener {
            var i =Intent(this,viewpageregshow::class.java)
            startActivity(i)

        }


    }
}