package com.vk59.drhoby.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.vk59.drhoby.R
import com.vk59.drhoby.config.AppConfig
import com.vk59.drhoby.model.Hobby

open class HobbyPagerAdapter(private var context: Context,
                             protected var hobbies: List<Hobby>) : RecyclerView.Adapter<PagerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        val view = holder.itemView
        view.findViewById<TextView>(R.id.nameHobbyText).text = hobbies[position].name
        view.findViewById<TextView>(R.id.descriptionHobbyText).text = hobbies[position].description
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)

