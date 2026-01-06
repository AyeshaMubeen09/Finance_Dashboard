package com.example.myproj.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myproj.Model.Transaction
import com.example.myproj.databinding.ItemTransactionBinding

class TransactionAdapter(
    private val list: List<Transaction>
) : RecyclerView.Adapter<TransactionAdapter.ViewHolder>() {

    // ViewHolder using ViewBinding
    class ViewHolder(val binding: ItemTransactionBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTransactionBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        // Set transaction data
        holder.binding.txtTitle.text = item.title
        holder.binding.txtDate.text = item.date

        // Format amount: positive = green, negative = red
        val formattedAmount = if(item.amount >= 0) "+$${"%,.2f".format(item.amount)}"
        else "-$${"%,.2f".format(-item.amount)}"
        holder.binding.txtAmount.text = formattedAmount

        // Optional: color based on income/expense
        holder.binding.txtAmount.setTextColor(
            if(item.amount >= 0)
                holder.binding.root.context.getColor(com.example.myproj.R.color.lightGreen)
            else
                holder.binding.root.context.getColor(com.example.myproj.R.color.red)
        )
    }

    override fun getItemCount(): Int = list.size
}

