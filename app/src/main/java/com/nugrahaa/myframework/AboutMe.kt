package com.nugrahaa.myframework

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AboutMe : AppCompatActivity(), View.OnClickListener {
    private val title: String = "About me"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        // button menuju linkedin
        val linkedinButton: Button = findViewById(R.id.btn_to_linkedin)
        linkedinButton.setOnClickListener(this)

        // memunculkan panah back dan mengubah title app bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = title
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_to_linkedin -> {
                val linkedinIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://linkedin.com/in/nugrahaa878/"))
                startActivity(linkedinIntent)
            }
        }
    }
}
