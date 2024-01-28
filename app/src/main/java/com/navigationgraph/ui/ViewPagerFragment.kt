package com.navigationgraph.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.navigationgraph.adapter.SplashViewPagerAdapter
import com.navigationgraph.databinding.FragmentViewPagerBinding

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding
    private lateinit var splashViewPagerAdapter: SplashViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        splashViewPagerAdapter = SplashViewPagerAdapter(
            childFragmentManager,
            lifecycle,
            listOf(FirstFragment(), SecondFragment(), ThirdFragment())
        )
        binding.viewPager2.adapter = splashViewPagerAdapter
    }
}