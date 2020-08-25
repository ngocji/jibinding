package com.jibinding.ui

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.jibase.ui.BaseViewModel
import com.jibase.ui.base.BaseActivity
import com.jibinding.helper.destroy
import com.jibinding.helper.initBinding

@Suppress("LeakingThis", "UNCHECKED_CAST")
abstract class BindActivity<VM : BaseViewModel> : BaseActivity<VM>() {
    lateinit var binding: ViewDataBinding

    override fun initView(savedInstanceState: Bundle?) {
        binding = initBinding(viewInflate.layout, viewModel)

        onViewReady(savedInstanceState)
        onViewListener()
    }

    override fun onDestroy() {
        // Hacky : There's a memory leak issue with data binding if we don't set lifeCycleOwner to null
        binding.destroy()
        super.onDestroy()
    }
}

typealias SimpleActivity = BindActivity<BaseViewModel>