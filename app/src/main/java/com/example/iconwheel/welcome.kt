package com.example.iconwheel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.iconwheel.databinding.ActivityMainBinding
import com.example.iconwheel.databinding.ActivityWelcomeBinding
import java.util.*

class welcome : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.clickmebt.setOnClickListener {
            random(binding.imageView1)
            random(binding.imageView2)
            random(binding.imageView3)
            random(binding.imageView4)
            random(binding.imageView5)
            random(binding.imageView6)
            random(binding.imageView7)
            random(binding.imageView8)



        }
    }

    private fun random(image: ImageView) {
        val photos = intArrayOf(
            R.drawable.emojifirst,
            R.drawable.emojisecond,
            R.drawable.emojithird,
            R.drawable.emojifour,
            R.drawable.emojifive,
            R.drawable.emojisix,
            R.drawable.emojiseven,
            R.drawable.emojieight,
            R.drawable.emojinine,
            R.drawable.emojiten

        )

        val ran = Random()
        val i: Int = ran.nextInt(photos.size)
        image.setImageResource(photos[i])
    }

}