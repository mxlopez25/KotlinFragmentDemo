package com.maloac.androidfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maloac.androidfragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(binding.flFragment.id, firstFragment)
            commit()
        }

        binding.btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flFragment.id, secondFragment)
                commit()
            }
        }

        binding.btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.flFragment.id, firstFragment)
                commit()
            }
        }
    }
}