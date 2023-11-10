package dev.bitcup.pexelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.bitcup.pexelsapp.databinding.ActivityMainBinding
import dev.bitcup.pexelsapp.fragments.BookmarkFragment
import dev.bitcup.pexelsapp.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fragmentNavViewTag.itemIconTintList = null
        supportFragmentManager.beginTransaction().replace(R.id.container,
            HomeFragment()).commit()
        binding.fragmentNavViewTag.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> supportFragmentManager.beginTransaction().replace(R.id.container,
                    HomeFragment()).commit()
                R.id.bookmark -> supportFragmentManager.beginTransaction().replace(R.id.container,
                    BookmarkFragment()).commit()
                else->{
                }
            }
            true
        }
    }


}