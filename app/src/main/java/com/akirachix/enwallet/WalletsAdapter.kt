package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletsAdapter(var list: List<Wallet>) : RecyclerView.Adapter<WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.enwallet_app, parent, false)
        return WalletViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = list[position]

        holder.salary.text = wallet.salary
        holder.money.text = wallet.money
        holder.date.text = wallet.date


    }

    override fun getItemCount(): Int {
        return list.size

    }
}

class WalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var salary = itemView.findViewById<TextView>(R.id.salary)
    var money = itemView.findViewById<TextView>(R.id.money)
    var date = itemView.findViewById<TextView>(R.id.date)

}