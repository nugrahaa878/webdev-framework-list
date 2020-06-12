package com.nugrahaa.myframework

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFrameworkAdapter(private val listFramework: ArrayList<Framework>): RecyclerView.Adapter<ListFrameworkAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_framework, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFramework.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val framework = listFramework[position]

        // melakukan set nilai dari masing masing item framework
        Glide.with(holder.itemView.context)
            .load(framework.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = framework.name
        holder.tvDetail.text = framework.detail

        // melakukan passing data ke activity detail
        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveWithData = Intent(mContext, FrameworkDetail::class.java)
            moveWithData.putExtra(FrameworkDetail.EXTRA_NAMA, framework.name)
            moveWithData.putExtra(FrameworkDetail.EXTRA_DETAIL, framework.detail)
            moveWithData.putExtra(FrameworkDetail.EXTRA_PHOTO, framework.photo)
            moveWithData.putExtra(FrameworkDetail.EXTRA_LINK, framework.linkCourse)
            mContext.startActivity(moveWithData)
        }
    }

    // menghubungkan antara data dengan layout
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}