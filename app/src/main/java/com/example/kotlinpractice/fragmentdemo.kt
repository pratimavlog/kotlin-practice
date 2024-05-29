package com.example.kotlinpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView

class fragmentdemo : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragmentdemo)

        var framenteg:FragmentContainerView=findViewById(R.id.framenteg)
        var fragment1button:AppCompatButton=findViewById(R.id.fragment1button)
        var fragment2button:AppCompatButton=findViewById(R.id.fragment2button)

        fragment1button.setOnClickListener{
            gotofragment(fragment1())

        }
        fragment2button.setOnClickListener{
            gotofragment(fragment2())

        }


    }

    fun gotofragment(fragment: Fragment)
    {
        var fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framenteg,fragment)
        fragmentTransaction.commit()
    }
}