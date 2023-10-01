package com.example.aplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.aplikasiandroidsederhana.model.Article
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Lengkapi kode disini

        val shareButton = findViewById<Button>(R.id.btnShare)
        shareButton.setOnClickListener {
            //Lengkapi kode disini
        }

    }


    private fun shareArticle(article: Article) {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, " //Lengkapi kode disini")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Share using"))
    }
}