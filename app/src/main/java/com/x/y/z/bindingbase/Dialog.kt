package com.x.y.z.bindingbase

import android.os.Bundle
import com.jibase.anotation.ViewInflate
import com.jibinding.ui.BindDialog

@ViewInflate(layout = R.layout.dialog_test)
class Dialog : BindDialog() {
    companion object {
        fun newInstance(title: String): Dialog {
            val ins = Dialog()
            ins.arguments = Bundle().apply {
                putString("title", title)
            }
            return ins
        }
    }
}