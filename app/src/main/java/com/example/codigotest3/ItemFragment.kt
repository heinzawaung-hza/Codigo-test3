package com.example.codigotest3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.codigotest3.placeholder.PlaceholderContent

class ItemFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : RecyclerView = inflater.inflate(R.layout.fragment_item_list, container, false) as RecyclerView
        val mAdapter = MyItemRecyclerViewAdapter(PlaceholderContent.ITEMS)
        with(view) {

            layoutManager =  NonScrollableLayoutManager(context)
            adapter = mAdapter

        }


        return view
    }
    class NonScrollableLayoutManager(context: Context) : LinearLayoutManager(context) {

        override fun canScrollVertically(): Boolean {
            return false
        }

        override fun canScrollHorizontally(): Boolean {
            return false
        }
    }


}