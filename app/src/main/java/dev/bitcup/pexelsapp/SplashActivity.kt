package dev.bitcup.pexelsapp

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import dev.bitcup.pexelsapp.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.iconImage.startAnimation(AnimationUtils.loadAnimation(this,R.anim.icon_rotation))
    }

    override fun onStart() {
        super.onStart()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
    }
}