package com.jqrgen.mvrxworkshop.views.colorPicker

import android.graphics.Color
import com.airbnb.mvrx.MvRxState

data class ColorState(
    var color: Int = Color.RED
): MvRxState
