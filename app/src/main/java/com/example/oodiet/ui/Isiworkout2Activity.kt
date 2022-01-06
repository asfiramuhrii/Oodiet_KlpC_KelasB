package com.example.oodiet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.oodiet.R

class Isiworkout2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isiworkout2)

        val video_view = findViewById<VideoView>(R.id.exerciseVideo1)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video_view)
        video_view.setVideoPath("https://rr4---sn-npoe7ney.googlevideo.com/videoplayback?expire=1641490930&ei=ktXWYY7lG4iI1wbj3JKYCQ&ip=80.246.28.23&id=o-APXgZ4ANNUXGWotRVrsKZ2A-Ba8IgkCg1seKmduOIHS_&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=sOwSgrvQS1-zYR3J01hR3hkG&cnr=14&ratebypass=yes&dur=954.734&lmt=1635483415661529&fexp=23886219,24001373,24007246&beids=23886219&c=WEB&txp=2210224&n=86TdkusLYsfODA&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgQKL6E7uDVkorZuGwgdoZEWHUUYeux8NpC9KcmqA9XGUCIEXi-J-fQ0HhZBMa6PBN5YHmN0a_fi6cLnKuPpitlmpU&rm=sn-5cjvh-up5z7d&req_id=fbb5ae1b2ce1a3ee&redirect_counter=2&cm2rm=sn-4g5ekl7z&cms_redirect=yes&mh=62&mip=180.249.57.13&mm=34&mn=sn-npoe7ney&ms=ltu&mt=1641469001&mv=m&mvi=4&pl=23&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgUKTnvFC7o3BkbIXBkXvq3SSPuCn-w99gqUmBp503dtECIDrN85strish0EMFZXLIH5e69KIoB4JzLN8PQvMr1riM")
        video_view.setMediaController(mediaController)
        video_view.requestFocus()
        video_view.start()
    }
}