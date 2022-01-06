package com.example.oodiet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.oodiet.R

 class Isiworkout1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isiworkout1)



        val video_view = findViewById<VideoView>(R.id.exerciseVideo)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video_view)
            video_view.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")
        video_view.setMediaController(mediaController)
        video_view.requestFocus()
        video_view.start()

    }
}

