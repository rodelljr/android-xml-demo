package com.roger.xmldemo.ui.icecream

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roger.xmldemo.R

import com.roger.xmldemo.databinding.FragmentIcecreamBinding
import java.util.zip.Inflater

class IceCreamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_icecream, container, false)
        if (view is RecyclerView) {
            view.layoutManager = LinearLayoutManager(view.context)
            view.adapter = IceCreamAdapter(getDesserts)
        }
        return view
    }
}

