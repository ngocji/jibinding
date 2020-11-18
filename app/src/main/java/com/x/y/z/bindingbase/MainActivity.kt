package com.x.y.z.bindingbase

import android.os.Bundle
import com.jibase.anotation.ViewInflate
import com.jibase.ui.BaseViewModel
import com.jibase.utils.UI
import com.jibinding.ui.BindActivity

@ViewInflate(layout = R.layout.activity_main, viewModel = TestViewModel::class)
class MainActivity : BindActivity<TestViewModel>() {
    override fun onViewReady(savedInstanceState: Bundle?) {
        UI.delay({
            viewModel.text.post("Next text")
        }, 1000)
    }
}