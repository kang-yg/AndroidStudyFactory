package com.example.studyandroid.view.CoordinatorLayout

import android.os.Bundle
import android.view.View
import com.example.studyandroid.Util.dpToPx
import com.example.studyandroid.Util.getStatusBarHeight
import com.example.studyandroid.databinding.FragmentCoordinatorlayoutBinding
import com.example.studyandroid.view.BaseFragment

class FragmentCoordinatorLayout : BaseFragment<FragmentCoordinatorlayoutBinding>(FragmentCoordinatorlayoutBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.let {
            // StatusBar 높이만큼 패딩 적용.
            it.tbFragCoordinatorLayout.setPadding(0, requireActivity().getStatusBarHeight(), 0, requireActivity().dpToPx(8))
        }
    }
}