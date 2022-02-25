package com.example.example_project_modul_5in_kotlin.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.example_project_modul_5in_kotlin.R
import com.example.example_project_modul_5in_kotlin.activity.model.ItemModel

class ItemAdapter(private val c: Context, var list: ArrayList<ItemModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_image_image, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemModel = list[position]
        if (holder is ViewHolder) {
            val textView = holder.textView
            val image  = holder.image

            textView.setText(itemModel.text)
            image.setImageResource(itemModel.imageRes)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView
    val image : ImageView
    init {
        textView = itemView.findViewById(R.id.tv_text)
        image = itemView.findViewById(R.id.images)
    }
}
