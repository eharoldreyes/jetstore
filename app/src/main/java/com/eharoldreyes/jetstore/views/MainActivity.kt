package com.eharoldreyes.jetstore.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.eharoldreyes.jetstore.R
import com.eharoldreyes.jetstore.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {


    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

//        val binding: MainActivityBinding = DataBindingUtil.setContentView(this,
//            R.layout.main_activity)
//        drawerLayout = binding.drawerLayout
//
//        setSupportActionBar(binding.toolbar)
    }


}