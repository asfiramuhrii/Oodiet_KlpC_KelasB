package com.example.oodiet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.oodiet.R

class Isiworkout4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isiworkout4)


        val video_view = findViewById<VideoView>(R.id.exerciseVideo3)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video_view)
        video_view.setVideoPath("https://rr4---sn-npoe7nss.googlevideo.com/videoplayback?expire=1641479082&ei=SqfWYfbqGbaC6dsP4JKLmA0&ip=37.120.193.251&id=o-AFFR02HIcVItptbo0KJZbbCl7tQ9_h3YvlSiil7in7vN&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=PAdvVMAH0pv3HONnZBxnywoG&gir=yes&clen=67871659&ratebypass=yes&dur=1303.591&lmt=1635728626031906&fexp=24001373,24007246&c=WEB&txp=6430434&n=yvVywpNhZdxYUQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIge_0qRONoTHNdNgIDHMrz945irJAEYE2-NqOFn9RGF6oCIAT70iUv7CiRlQVo6azvxGd8dIqgd9Tve0oMxnLKIo7K&rm=sn-nvm-cxbz7z,sn-4g5eke7z&req_id=4416ff813cdfa3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mh=64&mip=180.249.57.13&mm=29&mn=sn-npoe7nss&ms=rdu&mt=1641469429&mv=u&mvi=4&pl=23&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgIddMoHjuC6qhPPjjSIKJpIDYgm80UjNgSGJa8n6FxtoCIEGgvCwZUgW367WjheR01jsr0GC8mes7wI2T6QiJP3TU")
        video_view.setMediaController(mediaController)
        video_view.requestFocus()
        video_view.start()
    }
}