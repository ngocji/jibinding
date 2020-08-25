package com.jibinding.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.jibase.ui.dialog.BaseDialog
import com.jibinding.helper.initBinding

abstract class BindDialog : BaseDialog() {
    lateinit var binding: ViewDataBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = initBinding(container, viewInflate.layout, arguments, this)
        return binding.root
    }
}