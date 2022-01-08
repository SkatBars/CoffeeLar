package com.example.task23.coffee_lar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task23.R
import com.example.task23.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main, container, false)

        val coffies = mutableListOf<Coffee>()
        coffies.add(Coffee(R.drawable.coffee2, "Latte Art Speciality", "Expresso with milk"))
        coffies.add(Coffee(R.drawable.coffee1, "Long Black coffee", "Access water-milk"))

        val adapter = CoffeeAdapter(coffies, requireContext())
        binding.recyclerCoffee.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerCoffee.adapter = adapter
        return binding.root
    }
}