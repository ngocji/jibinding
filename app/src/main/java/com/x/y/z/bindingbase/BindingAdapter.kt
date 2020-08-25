package com.x.y.z.bindingbase

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("makeText")
fun makeText(v: TextView, title: String?) {
    v.text = title
}