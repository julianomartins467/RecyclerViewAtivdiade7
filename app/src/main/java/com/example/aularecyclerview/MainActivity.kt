package com.example.aularecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val listaContatos = ArrayList<Contato>()
    var recyclerView: RecyclerView? = null
    var adapter: ContatoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..30) {
            listaContatos.add(Contato("Juliano Martins", "juliano@gmail.com"))
        }
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        adapter = ContatoAdapter(listaContatos, this)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = adapter
    }
}