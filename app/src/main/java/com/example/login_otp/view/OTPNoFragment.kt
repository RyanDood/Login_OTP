package com.example.login_otp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.login_otp.R
import com.example.login_otp.databinding.FragmentOTPNoBinding

class OTPNoFragment : Fragment() {

    private var _binding : FragmentOTPNoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentOTPNoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener { previousScreen() }
    }

    fun previousScreen(){
        findNavController().navigate(R.id.action_OTPNoFragment_to_loginPhoneNoFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}