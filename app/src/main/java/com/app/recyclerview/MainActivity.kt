package com.app.recyclerview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("Germany")
        countryNameList.add("India")
        countryNameList.add("USA")

        detailList.add("Germany is a country")
        detailList.add("India is a country")
        detailList.add("USA is a country")

        imageList.add(R.drawable.ger)
        imageList.add(R.drawable.india)
        imageList.add(R.drawable.usa)

        adapter = CountryAdapter(countryNameList,detailList,imageList,this@MainActivity)
        recyclerView.adapter = adapter

    }
}