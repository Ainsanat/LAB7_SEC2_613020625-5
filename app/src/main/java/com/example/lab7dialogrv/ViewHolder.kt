package com.example.lab7dialogrv
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.std_item_layout.view.*

class ViewHolder (v: View): RecyclerView.ViewHolder(v){
    val tvID = v.tv_id
    val tvName = v.tv_name
    val tvAge = v.tv_age
}