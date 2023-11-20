package com.example.listadoparques


import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoparques.adapter.ParkAdapter
import com.example.listadoparques.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("ListadoParques")
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Recycler.layoutManager = LinearLayoutManager(this)
        var adapter = ParkAdapter(ParkProvider.parkList)
        binding.Recycler.adapter = adapter

        binding.filtro.addTextChangedListener {filtro ->
            val filtroParque = ParkProvider.parkList.filter { Park ->
                Park.nombre.lowercase().contains(filtro.toString().lowercase())}
               adapter.actualizarParques(filtroParque)
            }
        }
    }