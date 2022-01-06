package com.example.oodiet.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.oodiet.IsiresipeActivity
import com.example.oodiet.R
import com.example.oodiet.databinding.FragmentNotificationsBinding
import com.example.oodiet.ui.Isiresipe2Activity
import com.example.oodiet.ui.Isiresipe3Activity
import com.example.oodiet.ui.Isiresipe4Activity
import com.example.oodiet.ui.Isiresipe5Activity

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)


        val root: View = binding.root

        var btnResep1: CardView = root.findViewById(R.id.resep1)
        btnResep1.setOnClickListener {
            val intent = Intent(getActivity(), IsiresipeActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnResep2: CardView = root.findViewById(R.id.resep2)
        btnResep2.setOnClickListener {
            val intent = Intent(getActivity(), Isiresipe2Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnResep3: CardView = root.findViewById(R.id.resep3)
        btnResep3.setOnClickListener {
            val intent = Intent(getActivity(), Isiresipe3Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnResep4: CardView = root.findViewById(R.id.resep4)
        btnResep4.setOnClickListener {
            val intent = Intent(getActivity(), Isiresipe4Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}