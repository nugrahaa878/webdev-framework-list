package com.nugrahaa.myframework

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class FrameworkDetail : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LINK = "extra_link"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_framework_detail)

        // memunculkan tombol panah back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // mengubah title app bar sesuai dengan nama framework yang di klik
        supportActionBar?.title = intent.getStringExtra(EXTRA_NAMA)

        // menghubungkan data dengan layout
        val tvNamaDetail: TextView = findViewById(R.id.tv_nama_detail)
        val tvDetailDetail: TextView = findViewById(R.id.tv_detail_detail)
        val imgProfile: ImageView = findViewById(R.id.img_profile_detail)
        val buttonCourse: Button = findViewById(R.id.btn_to_course)

        // mengambil data dari intent yang di pass
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)


        // melakukan setting nilai dengan data yang di dapat
        tvNamaDetail.text = nama
        tvDetailDetail.text = detail
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(imgProfile)

        buttonCourse.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_to_course -> {
                val linkCourse = intent.getStringExtra(EXTRA_LINK)
                val courseIntent = Intent(Intent.ACTION_VIEW, Uri.parse(linkCourse))
                startActivity(courseIntent)
            }
        }
    }
}
