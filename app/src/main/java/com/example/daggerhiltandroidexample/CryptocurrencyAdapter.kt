package com.example.daggerhiltandroidexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>):
    RecyclerView.Adapter<CryptocurrencyAdapter.CryptoCurrencyViewHolder>() {

    class CryptoCurrencyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(index: Cryptocurrency) {
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.image))

            itemView.findViewById<TextView>(R.id.cryptocurrency).text = index.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoCurrencyViewHolder {
        // Inflating list data from list_item to view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CryptoCurrencyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CryptoCurrencyViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }

    override fun getItemCount(): Int = cryptocurrency.size

}