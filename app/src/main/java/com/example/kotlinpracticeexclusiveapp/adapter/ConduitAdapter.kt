package com.example.kotlinpracticeexclusiveapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinpracticeexclusiveapp.R
import com.example.kotlinpracticeexclusiveapp.data.ConduitInfo
import kotlinx.android.synthetic.main.card_conduit_item_lists.view.*

class ConduitAdapter(var conduits: List<ConduitInfo>): RecyclerView.Adapter<ConduitAdapter.ConduitViewHolder>() {

    inner class ConduitViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConduitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_conduit_item_lists, parent, false)
        return ConduitViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConduitViewHolder, position: Int) {
       holder.itemView.apply {
           spinnerCableType.text = conduits[position].cableType
           spinnerCableSize.text = conduits[position].cableSize.toString()
           edtCableAmount.text = conduits[position].cableAmount.toString()
       }
    }

    override fun getItemCount(): Int {
        //Return how many we have in recyclerview
        return conduits.size
    }

}