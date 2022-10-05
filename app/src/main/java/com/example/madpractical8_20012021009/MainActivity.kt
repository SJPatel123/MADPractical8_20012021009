package com.example.madpractical8_20012021009

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity(), Animation.AnimationListener {
    lateinit var alarmimgs : ImageView
    lateinit var alarmimg_frameByFrameAnimation : AnimationDrawable
    lateinit var alarmimgAnimation : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alarmimgs = findViewById(R.id.alarmImages)
        alarmimgs.setBackgroundResource(R.drawable.alarm_image_list)

        alarmimg_frameByFrameAnimation = alarmimgs.background as AnimationDrawable

        alarmimgAnimation = AnimationUtils.loadAnimation(this, R.anim.alarm_animation)
        alarmimgAnimation.setAnimationListener(this)
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if(hasFocus){
            alarmimg_frameByFrameAnimation.start()
            alarmimgs.startAnimation(alarmimgAnimation)
        }
        else{
            alarmimg_frameByFrameAnimation.stop()
        }
    }
    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {

    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}