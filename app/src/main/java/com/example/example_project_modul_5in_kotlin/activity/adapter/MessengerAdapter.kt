package com.example.example_project_modul_5in_kotlin.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.example_project_modul_5in_kotlin.R
import com.example.example_project_modul_5in_kotlin.activity.model.Chat
import com.google.android.material.imageview.ShapeableImageView

class MessengerAdapter(var context: Context, var items:ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_three_messenger, parent, false)
        return MessageViewHolder5(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message = items[position]

        if (holder is MessageViewHolder5) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            iv_profile.setImageResource(message.message!!.profile)
            tv_fullname.text = message.message!!.fullname

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}


class MessageViewHolder5(var view: View) : RecyclerView.ViewHolder(view) {
    var iv_profile : ShapeableImageView
    var tv_fullname: TextView

    init {
        iv_profile = view.findViewById(R.id.iv_profile4)
        tv_fullname = view.findViewById(R.id.tv_fullname4)
    }
}