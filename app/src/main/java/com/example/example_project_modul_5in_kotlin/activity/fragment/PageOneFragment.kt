package com.example.example_project_modul_5in_kotlin.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.example_project_modul_5in_kotlin.R
import com.example.example_project_modul_5in_kotlin.activity.adapter.ChatAdapter
import com.example.example_project_modul_5in_kotlin.activity.adapter.ChatAdapterTwo
import com.example.example_project_modul_5in_kotlin.activity.model.Chat
import com.example.example_project_modul_5in_kotlin.activity.model.Message
import com.example.example_project_modul_5in_kotlin.activity.model.Room


class PageOneFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var recycler_two: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_first, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recycler_two = view.findViewById(R.id.recycler_two)
        recyclerView.layoutManager = GridLayoutManager(context,1)
        recycler_two.layoutManager = GridLayoutManager(context,2)

        refreshAdapters(getAllChats())
        refreshAdaptersTwo(getAllChatsTwo())
    }

    private fun getAllChatsTwo(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList()

        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(stories))
        chats.add(Chat(Message(R.drawable.arab1,"Ilhombek",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Maqsit",true,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Jamol",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Karim",true,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Leyla",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Amanda",true,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Alex",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Bahodir",true,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Olim",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Zayniddin",true,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Javohir",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Umit",true,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Zaynab",false,0)))
        chats.add(Chat(Message(R.drawable.arab1,"Sherali",false,0)))
        return chats
    }

    private fun refreshAdaptersTwo(allChatsTwo: ArrayList<Chat>) {
        val adapter = context?.let { ChatAdapterTwo(it, allChatsTwo) }
        recycler_two.adapter = adapter
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = context?.let { ChatAdapter(it, chats) }
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList()
        stories.add(Room(R.drawable.arab1,"",0))
        stories.add(Room(R.drawable.arab1,"Laziz Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Amir Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Said Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Jamshid Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Begzod Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.arab1,"Abdulhay Ubaydullayev",1))

        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(stories))
        return chats
    }
}