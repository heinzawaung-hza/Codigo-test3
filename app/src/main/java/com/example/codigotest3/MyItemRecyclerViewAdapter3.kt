package com.example.codigotest3

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.codigotest3.databinding.FragmentItem2Binding
import com.example.codigotest3.placeholder.PlaceholderContent.PlaceholderItem

class MyItemRecyclerViewAdapter3(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter3.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItem2Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItem2Binding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.textView3
        val contentView: TextView = binding.textView5

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}