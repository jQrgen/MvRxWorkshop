package com.jqrgen.mvrxworkshop.coreMvRx

import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.BuildConfig
import com.airbnb.mvrx.MvRxState

// DevFest: Setup for the MvRxViewModel, not important for understanding the library at this point.
abstract class MvRxViewModel<S : MvRxState>(initialState: S) : BaseMvRxViewModel<S>(initialState, debugMode = BuildConfig.DEBUG)