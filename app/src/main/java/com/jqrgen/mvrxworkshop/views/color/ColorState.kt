package com.jqrgen.mvrxworkshop.views.color

import android.graphics.Color
import com.airbnb.mvrx.MvRxState

data class ColorState(
    var color: Int = Color.RED
): MvRxState
