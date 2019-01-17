package com.github.luecy1.pinch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView

class CustomImageView: ImageView {
    constructor(context:Context) : super(context) {
    }
    constructor(context:Context, attrs: AttributeSet) : super(context, attrs) {
    }
    constructor(context:Context, attrs:AttributeSet, defStyle:Int) : super(context, attrs, defStyle) {
    }

    override fun performClick(): Boolean {
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val result = super.onTouchEvent(event)
        Log.d("MyApp","tauch!")
        return result
    }
}