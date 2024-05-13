package com.example.newhorseapp.ui.feedingschedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.newhorseapp.databinding.FragmentFeedingScheduleBinding
import com.example.newhorseapp.ui.settings.SettingsViewModel

class FeedingScheduleFragment : Fragment() {

    private var _binding: FragmentFeedingScheduleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val settingsViewModel =
            ViewModelProvider(this).get(SettingsViewModel::class.java)

        _binding = FragmentFeedingScheduleBinding.inflate(inflater, container, false)
        val root: View = binding.root


        settingsViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}