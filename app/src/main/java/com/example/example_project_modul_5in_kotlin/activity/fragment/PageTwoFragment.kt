package com.example.example_project_modul_5in_kotlin.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.example_project_modul_5in_kotlin.R
import com.example.example_project_modul_5in_kotlin.activity.model.Chat
import com.example.example_project_modul_5in_kotlin.activity.adapter.PeopleAdapter
import com.example.example_project_modul_5in_kotlin.activity.model.Message
import com.example.example_project_modul_5in_kotlin.activity.model.Room

class PageTwoFragment : Fragment() {

    lateinit var recyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_second, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView3)
        recyclerView.setLayoutManager(GridLayoutManager(context,1))

        refreshAdapters(getAllChats())
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = context?.let { PeopleAdapter(it, chats) }
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.arab1,"",0))


        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stories))

        chats.add(Chat(Message(R.drawable.arab2,"Ilhombek",false,R.drawable.arab2)))
        chats.add(Chat(Message(R.drawable.arab2,"Maqsit",true,R.drawable.arab1)))

        return chats
    }


}