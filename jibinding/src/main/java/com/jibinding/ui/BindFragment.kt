package com.jibinding.ui

import android.content.res.Resources.ID_NULL
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.jibase.ui.BaseViewModel
import com.jibase.ui.base.BaseFragment
import com.jibinding.helper.destroy
import com.jibinding.helper.initBinding

@Suppress("LeakingThis", "UNCHECKED_CAST")
abstract class BindFragment<VM : BaseViewModel> : BaseFragment<VM>() {
    lateinit var binding: ViewDataBinding

    override fun initView(inflater: LayoutInflater, container: ViewGroup?): View? {
        return if (this.viewInflate.layout != ID_NULL) {
            // create data binding
            binding = initBinding(viewInflate.layout, inflater, container, viewModel)

            // return the view
            binding.root
        } else {
            null
        }
    }

    override fun onDestroyView() {
        // Hacky : There's a memory leak issue with data binding if we don't set lifeCycleOwner to null
        binding.destroy()
        super.onDestroyView()
    }
}

typealias SimpleBindFragment = BindFragment<BaseViewModel>