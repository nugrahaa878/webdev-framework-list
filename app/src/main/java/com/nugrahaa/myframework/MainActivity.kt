package com.nugrahaa.myframework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFrameworks: RecyclerView
    private var list: ArrayList<Framework> = arrayListOf()
    private var title: String = "WebDev Framework"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set judul app bar
        supportActionBar?.title = title

        rvFrameworks = findViewById(R.id.rv_framework)
        rvFrameworks.setHasFixedSize(true)

        // memasukkan data dan menampilkan recycler
        list.addAll(FrameworksData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvFrameworks.layoutManager = LinearLayoutManager(this)
        val listFrameworkAdapter = ListFrameworkAdapter(list)
        rvFrameworks.adapter = listFrameworkAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun changeToAboutMe() {
        val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
        startActivity(moveIntent)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_me -> {
                changeToAboutMe()
            }
        }
    }
}
