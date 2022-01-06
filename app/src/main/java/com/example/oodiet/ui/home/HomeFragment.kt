package com.example.oodiet.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.oodiet.LoginActivity
import com.example.oodiet.R
import com.example.oodiet.databinding.FragmentHomeBinding
import com.example.oodiet.databinding.FragmentNotificationsBinding
import com.example.oodiet.ui.Artikel1Activity
import com.example.oodiet.ui.Artikel2Activity
import com.example.oodiet.ui.Artikel3Activity
import com.example.oodiet.ui.Isiresipe4Activity
import com.example.oodiet.ui.notifications.NotificationsViewModel

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var btnArtikel1: ImageButton = root.findViewById(R.id.artikel1)
        btnArtikel1.setOnClickListener {
            val intent = Intent(getActivity(), Artikel1Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnArtikel2: ImageButton = root.findViewById(R.id.artikel2)
        btnArtikel2.setOnClickListener {
            val intent = Intent(getActivity(), Artikel2Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnArtikel3: ImageButton = root.findViewById(R.id.artikel3)
        btnArtikel3.setOnClickListener {
            val intent = Intent(getActivity(), Artikel3Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnLogout: Button = root.findViewById(R.id.btn_logout)
        btnLogout.setOnClickListener {
            val intent = Intent(getActivity(), LoginActivity::class.java)
            getActivity()?.startActivity(intent)
            activity?.finish()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}