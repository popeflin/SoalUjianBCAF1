package com.example.aplikasiandroidsederhana.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasiandroidsederhana.R
import com.example.aplikasiandroidsederhana.model.Article

class ArticleAdapter(private val articles: List<Article>, private val clickListener: (Article) -> Unit) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(article: Article) {
            //Lengkapi kode disini
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view =  //Lengkapi kode disini
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        //Lengkapi kode disini
    }

    override fun getItemCount() =  //Lengkapi kode disini
}
