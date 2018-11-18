package com.jqrgen.mvrxworkshop.views

import com.airbnb.mvrx.MvRxState

data class LiveButtonsState(
    var buttonCounter: Int = 0
): MvRxState