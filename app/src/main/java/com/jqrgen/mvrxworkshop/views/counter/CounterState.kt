package com.jqrgen.mvrxworkshop.views.counter

import com.airbnb.mvrx.MvRxState
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

data class CounterState(
    var count: Int = 0
): MvRxState