package com.zack.lab_assignment_2_android_development

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(private val itemList : List<ItemBlog>, private val context: Context) : RecyclerView.Adapter<BlogHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.blog_item, parent, false)
        return BlogHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: BlogHolder, position: Int) {
        val item = itemList[position]
        holder.title.text = item.title;
        holder.image.setImageResource(item.image)


        holder.itemView.setOnClickListener {
            val intent = Intent(context, BlogDetails::class.java)

            intent.putExtra("title", item.title)
            intent.putExtra("image", item.image)
            intent.putExtra("date", item.date)
            intent.putExtra("author", item.author)
            intent.putExtra("detail", item.description)

            context.startActivity(intent)
        }
    }

}

class BlogHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val image  = itemView.findViewById<ImageView>(R.id.blog_image);
    val title = itemView.findViewById<TextView>(R.id.blog_heading)
}