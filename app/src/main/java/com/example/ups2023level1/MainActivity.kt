package com.example.ups2023level1

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

import com.example.ups2023level1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.fragmentContainer
        ) as NavHostFragment
        navController = navHostFragment.navController

        binding.customBottomNavigation.run {
            linear.setOnClickListener {
                clear()
                button.imageTintList =
                    ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.red, null))
                textView2.setTextColor(ResourcesCompat.getColor(resources, R.color.red, null))
                navController.navigate(R.id.newsFragment)
            }

            linear2.setOnClickListener {
                clear()
                button2.imageTintList =
                    ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.red, null))
                textView3.setTextColor(ResourcesCompat.getColor(resources, R.color.red, null))
                navController.navigate(R.id.promoFragment)
            }

            linear3.setOnClickListener {
                clear()
                button3.imageTintList =
                    ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.red, null))
                textView4.setTextColor(ResourcesCompat.getColor(resources, R.color.red, null))
                navController.navigate(R.id.referralFragment)
            }


            linear4.setOnClickListener {
                clear()
                button4.imageTintList =
                    ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.red, null))
                textView5.setTextColor(ResourcesCompat.getColor(resources, R.color.red, null))
                navController.navigate(R.id.tariffFragment)
            }

            linear5.setOnClickListener {
                clear()
                button5.imageTintList =
                    ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.red, null))
                textView6.setTextColor(ResourcesCompat.getColor(resources, R.color.red, null))
                navController.navigate(R.id.playstationFragment)
            }

            linear6.setOnClickListener {
                clear()
                button6.imageTintList =
                    ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.red, null))
                textView7.setTextColor(ResourcesCompat.getColor(resources, R.color.red, null))
                navController.navigate(R.id.bookingFragment)
            }
        }
    }

    private fun clear() {
        binding.customBottomNavigation.run {
            button.imageTintList =
                ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.gray, null))
            textView2.setTextColor(ResourcesCompat.getColor(resources, R.color.gray, null))

            button2.imageTintList =
                ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.gray, null))
            textView3.setTextColor(ResourcesCompat.getColor(resources, R.color.gray, null))

            button3.imageTintList =
                ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.gray, null))
            textView4.setTextColor(ResourcesCompat.getColor(resources, R.color.gray, null))

            button4.imageTintList =
                ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.gray, null))
            textView5.setTextColor(ResourcesCompat.getColor(resources, R.color.gray, null))

            button5.imageTintList =
                ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.gray, null))
            textView6.setTextColor(ResourcesCompat.getColor(resources, R.color.gray, null))

            button6.imageTintList =
                ColorStateList.valueOf(ResourcesCompat.getColor(resources, R.color.gray, null))
            textView7.setTextColor(ResourcesCompat.getColor(resources, R.color.gray, null))


        }
    }

}