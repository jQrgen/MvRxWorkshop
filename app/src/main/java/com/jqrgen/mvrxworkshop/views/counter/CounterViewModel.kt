package com.jqrgen.mvrxworkshop.views.counter

import android.annotation.SuppressLint
import com.jqrgen.mvrxworkshop.MvRxViewModel
import com.jqrgen.mvrxworkshop.models.CounterModelController

class CounterViewModel(
    initialState: CounterState
): MvRxViewModel<CounterState>(initialState) {

    init {
        observeCounterModel()
    }

    fun incrementCounter() {
        // TODO: Use model directly
        withState { liveButtonState ->
            val newButtonCount = liveButtonState.count + 1
            CounterModelController.update(newButtonCount)
        }
    }

    @SuppressLint("CheckResult")
    private fun observeCounterModel() {
        CounterModelController.observable().subscribe{count ->
            setState { copy(count = count) }
        }
    }

}