package com.example.oodiet.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.oodiet.IsiresipeActivity
import com.example.oodiet.R
import com.example.oodiet.databinding.FragmentDashboardBinding
import com.example.oodiet.ui.Isiworkout1Activity
import com.example.oodiet.ui.Isiworkout2Activity
import com.example.oodiet.ui.Isiworkout3Activity
import com.example.oodiet.ui.Isiworkout4Activity

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var btnVideo1: LinearLayout = root.findViewById(R.id.olahraga1)
        btnVideo1.setOnClickListener {
            val intent = Intent(getActivity(), Isiworkout1Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnVideo2: LinearLayout = root.findViewById(R.id.olahraga2)
        btnVideo2.setOnClickListener {
            val intent = Intent(getActivity(), Isiworkout2Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnVideo3: LinearLayout = root.findViewById(R.id.olahraga3)
        btnVideo3.setOnClickListener {
            val intent = Intent(getActivity(), Isiworkout3Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        var btnVideo4: LinearLayout = root.findViewById(R.id.olahraga4)
        btnVideo4.setOnClickListener {
            val intent = Intent(getActivity(), Isiworkout4Activity::class.java)
            getActivity()?.startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}