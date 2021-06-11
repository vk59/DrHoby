package com.vk59.drhoby.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.vk59.drhoby.R
import com.vk59.drhoby.config.AppConfig
import com.vk59.drhoby.databinding.CardViewHobbyBinding
import com.vk59.drhoby.model.Hobby

open class HobbyAdapter(private var context: Context)
    : RecyclerView.Adapter<PagerVH>() {

    private var hobbies: List<Hobby>? = null

    fun setHobbies(hobbies: ArrayList<Hobby>) {
        this.hobbies = hobbies
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.card_view_hobby,
            parent,
            false))

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        hobbies?.let {
            holder.binding.hobby = it[position]
        }
    }

    override fun getItemCount(): Int {
        return hobbies?.size ?: 0
    }
}

class PagerVH(val binding: CardViewHobbyBinding) : RecyclerView.ViewHolder(binding.root)

