package com.orbit.kotlin_roomdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.orbit.kotlin_roomdata.R


class ContactRecyclerAdapter(contacts: ArrayList<Contact>, listener: OnItemClickListener) : RecyclerView.Adapter<ContactRecyclerAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var currentContact: Contact = listContacts[position]

        var nameContact = currentContact.name
        var numberContact = currentContact.number

        holder!!.mName.text = nameContact
        holder!!.mNumber.text = numberContact

        holder.bind(currentContact, listenerContact)    }

    private var listContacts: List<Contact> = contacts

    private var listenerContact: OnItemClickListener = listener

    interface OnItemClickListener {
        fun onItemClick(contact: Contact)
    }


    override fun getItemCount(): Int {
        return listContacts.size
    }



    fun addContacts(listContacts: List<Contact>) {
        this.listContacts = listContacts
        notifyDataSetChanged()
    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mName = itemView.findViewById<TextView>(R.id.name_contact)!!
        var mNumber = itemView.findViewById<TextView>(R.id.number_contact)!!

        fun bind(contact: Contact, listener: OnItemClickListener) {
            itemView.setOnClickListener {
                listener.onItemClick(contact)
            }
        }

    }
}