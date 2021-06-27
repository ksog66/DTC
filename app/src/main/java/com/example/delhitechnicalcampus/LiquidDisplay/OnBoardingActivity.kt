package com.example.delhitechnicalcampus.LiquidDisplay

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import android.view.animation.Animation
import android.os.Bundle
import com.example.delhitechnicalcampus.R
import android.content.SharedPreferences
import android.content.Intent
import com.example.delhitechnicalcampus.MainActivity
import android.content.SharedPreferences.Editor
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.delhitechnicalcampus.LiquidDisplay.OnBoardingFragment1
import com.example.delhitechnicalcampus.LiquidDisplay.OnBoardingFragment2
import com.example.delhitechnicalcampus.LiquidDisplay.OnBoardingFragment3
import com.example.delhitechnicalcampus.LiquidDisplay.OnBoardingActivity

class OnBoardingActivity : AppCompatActivity() {
    private var viewPager: ViewPager? = null
    private var pagerAdapter: ScreenSlidePagerAdapter? = null
    var anim: Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        getSupportActionBar()?.hide();
        val preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
        val firstTime = preferences.getString("FirstCompanyAdded", "")
        if (firstTime == "Yes") {
            val intent = Intent(this@OnBoardingActivity, MainActivity::class.java)
            startActivity(intent)
        } else {
            val editor = preferences.edit()
            editor.putString("FirstCompanyAdded", "Yes")
            editor.apply()
        }
        viewPager = findViewById(R.id.pagerr)
        pagerAdapter = ScreenSlidePagerAdapter(
            supportFragmentManager
        )
        viewPager?.setAdapter(pagerAdapter)
        //        anim = AnimationUtils.loadAnimation(this,R.anim.o_b_anim);
//        viewPager.startAnimation(anim);
    }

    internal inner class ScreenSlidePagerAdapter(fm: FragmentManager) :
        FragmentStatePagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            when (position) {
                0 -> {
                    return OnBoardingFragment1()
                }
                1 -> {
                    return OnBoardingFragment2()
                }
                2 -> {
                    return OnBoardingFragment3()
                }
            }
            return null!!
        }

        override fun getCount(): Int {
            return NUM_PAGES
        }
    }

    companion object {
        private const val NUM_PAGES = 3
    }
}