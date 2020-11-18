package com.x.y.z.bindingbase

import com.jibase.livedata.ILiveData
import com.jibase.ui.BaseViewModel

class TestViewModel : BaseViewModel(){
    val text = ILiveData<String>()
}