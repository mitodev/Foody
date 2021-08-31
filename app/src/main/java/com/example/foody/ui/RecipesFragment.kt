package com.example.foody.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.foody.MainViewModel
import com.example.foody.databinding.FragmentRecipesBinding

class recipesFragment : Fragment() {

    private val mainViewModel :MainViewModel by viewModels()
    private var _binding: FragmentRecipesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRecipesBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.RecyclerView.showShimmer()

        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}