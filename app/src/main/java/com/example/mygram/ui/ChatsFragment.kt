package com.example.mygram.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mygram.R
import com.example.mygram.databinding.FragmentChatBinding

/**
 * A simple [Fragment] subclass.
 */
class ChatsFragment : Fragment() {
    private lateinit var mBinding: FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentChatBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
    }
}
