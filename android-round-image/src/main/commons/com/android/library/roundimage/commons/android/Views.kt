package com.android.library.roundimage.commons.android

import android.graphics.Rect
import android.view.View

internal object Views {

    fun View.layout(rect: Rect) = layout(rect.left, rect.top, rect.right, rect.bottom)
}