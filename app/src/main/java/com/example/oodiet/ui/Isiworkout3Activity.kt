package com.example.oodiet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.oodiet.R

class Isiworkout3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isiworkout3)

        val video_view = findViewById<VideoView>(R.id.exerciseVideo2)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video_view)
        video_view.setVideoPath("https://rr3---sn-2uuxa3vh-02bd.googlevideo.com/videoplayback?expire=1641491284&ei=9NbWYaX-FYeF0u8P8b2a2AM&ip=195.246.120.31&id=o-AG-AKVXIejEGWZe_XPzQVCHc-AmNDpjukpjU-wG4vdE4&itag=18&source=youtube&requiressl=yes&spc=4ocVCxxarf16EoIvTz93xh3nku7y&vprv=1&mime=video%2Fmp4&ns=0M9elk-oDasf9j-aTTAZTccG&gir=yes&clen=73672751&ratebypass=yes&dur=1018.520&lmt=1604135704635163&fexp=24001373,24007246&c=WEB&txp=5531422&n=8qNB6TOBrKks1g&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgEzk6_-P92aXl05FfhfsvxvJQTB-xNcX5EIFUzKDB1zkCIG8Sqzqu0TTGraFKXhHw4WT_QX85c8GkwcXVpDXZQFNb&redirect_counter=1&rm=sn-5golk76&req_id=2210e6cb7a4a3ee&cms_redirect=yes&ipbypass=yes&mh=Dd&mip=180.249.57.13&mm=31&mn=sn-2uuxa3vh-02bd&ms=au&mt=1641469257&mv=m&mvi=3&pl=23&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAMGuUsblibxBY77LtO3xM80yP8xPKk5XKdEXiba1nZJrAiEAzz3Bw8gJXhrA-3q4ycmzRuaHC6k_ktCHHeAYkPbbMbk%3D")
        video_view.setMediaController(mediaController)
        video_view.requestFocus()
        video_view.start()
    }
}