package com.jqrgen.mvrxworkshop.views

import com.airbnb.mvrx.MvRxState

data class LiveButtonsState(
    var buttonOneTicker: Int = 0
): MvRxState