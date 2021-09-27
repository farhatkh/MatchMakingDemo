package com.yuyakaido.android.cardstackview.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yuyakaido.android.cardstackview.sample.model.Root
import java.util.ArrayList

class CardStackAdapter(
        private var spots: ArrayList<Root?>?
) : RecyclerView.Adapter<CardStackAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_spot, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val spot = spots?.get(position)
        holder.name.text = "${spot?.results?.get(position)?.id}. ${spot?.results?.get(position)?.name?.first+" "+spot?.results?.get(position)?.name?.last}"
        holder.city.text = spot?.results?.get(position)?.location?.city
        Glide.with(holder.image)
                .load("https://source.unsplash.com/Xq1ntWruZQI/600x800")
                .into(holder.image)
        holder.itemView.setOnClickListener { v ->
            Toast.makeText(v.context, spot?.results?.get(position)?.name?.first, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return spots?.size!!
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.item_name)
        var city: TextView = view.findViewById(R.id.item_city)
        var image: ImageView = view.findViewById(R.id.item_image)
    }

}
