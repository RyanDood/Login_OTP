package com.example.login_otp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.login_otp.R
import com.example.login_otp.databinding.FragmentLoginPhoneNoBinding

class LoginPhoneNoFragment : Fragment() {

    private var _binding : FragmentLoginPhoneNoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentLoginPhoneNoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener { nextScreen() }
    }

    fun nextScreen(){
        findNavController().navigate(R.id.action_loginPhoneNoFragment_to_OTPNoFragment2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}