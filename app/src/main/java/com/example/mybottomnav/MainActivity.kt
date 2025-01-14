package com.example.mybottomnav

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mybottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        with(binding){
            val navController = findNavController(R.id.nav_host_fragment_container) // Mengambil Id (Host_Fragment) dari Activity Main
            bottomNavigationView.setupWithNavController(navController) // Mengambil Bottom Navigation dari Activity Main
        }
    }

}