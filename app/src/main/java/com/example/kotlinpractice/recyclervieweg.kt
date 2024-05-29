package com.example.kotlinpractice




import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recyclervieweg : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView

    private lateinit var datalist:ArrayList<Dataclass>
    private lateinit var imagelist:Array<Int>
    private lateinit var titlelist:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recyclervieweg)

        imagelist = arrayOf(
            R.drawable.first,
            R.drawable.sec,
            R.drawable.third,
            R.drawable.fourth,
            R.drawable.fifth,
            R.drawable.sixth,
            R.drawable.seventh,
            R.drawable.eigth)

        titlelist= arrayOf(
            "First", "Sec","third","fourth","fifith","sixth","Seventh","eigth")

         recyclerview= findViewById(R.id.recyclerview)
        recyclerview.layoutManager=LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        datalist= arrayListOf<Dataclass>()
        getdata()

    }


    fun getdata(){
        for (i in imagelist.indices)
        {
            val dataclass=Dataclass(imagelist[i],titlelist[i])
            datalist.add(dataclass)

        }
        recyclerview.adapter=adapterclass(datalist)

    }




}
