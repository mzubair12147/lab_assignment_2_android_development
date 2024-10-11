package com.zack.lab_assignment_2_android_development

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BlogDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog_details)

        val intent = intent

        findViewById<TextView>(R.id.blog_title).text = intent.getStringExtra("title")
        findViewById<TextView>(R.id.author_name).text = intent.getStringExtra("author")
        findViewById<TextView>(R.id.date_posted).text = intent.getStringExtra("date")
        findViewById<TextView>(R.id.blog_text).text = intent.getStringExtra("detail")
        findViewById<ImageView>(R.id.blog_hero_image).setImageResource(intent.getIntExtra("image", 0))
    }
}