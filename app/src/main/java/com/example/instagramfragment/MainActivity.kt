package com.example.instagramfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment2 = HomeFragment2()

        binding.apply {

            supportFragmentManager.beginTransaction()
                .add(R.id.my_container, homeFragment2)
                .commit()
        }
    }
}