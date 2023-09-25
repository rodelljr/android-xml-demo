package com.roger.xmldemo.ui.icecream

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.roger.xmldemo.R

class IceCreamAdapter(private val dataSet: List<Dessert>) :
    RecyclerView.Adapter<FlavorsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlavorsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dessert, parent, false)
        return FlavorsViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlavorsViewHolder, position: Int) {
        holder.myIcon.setImageResource(dataSet[position].icon)
        holder.dessert.text = dataSet[position].name
        holder.dessertType.text = dataSet[position].desertType
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}
class FlavorsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val myIcon: ImageView
    val dessert: TextView
    val dessertType: TextView

    init {
        myIcon = view.findViewById(R.id.iv_icon)
        dessert = view.findViewById(R.id.tv_dessert_name)
        dessertType = view.findViewById(R.id.tv_dessert_type)
    }

}