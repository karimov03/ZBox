package uz.turgunboyevjurabek.zbox.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.turgunboyevjurabek.zbox.databinding.ItemOrderRvBinding
import uz.turgunboyevjurabek.zbox.madels.Order.Order_get

import uz.turgunboyevjurabek.zbox.madels.Product
import uz.turgunboyevjurabek.zbox.network.ApiClinet

class RvAdapterOrder(val context: Context, val list2:ArrayList<Order_get>):RecyclerView.Adapter<RvAdapterOrder.Vh>() {
    inner class Vh(val itemOrderRvBinding: ItemOrderRvBinding):ViewHolder(itemOrderRvBinding.root){

        fun onBind(order_get: Order_get,position: Int){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemOrderRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int =list2.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list2[position],position)
    }
}