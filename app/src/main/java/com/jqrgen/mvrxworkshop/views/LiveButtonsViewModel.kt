package com.jqrgen.mvrxworkshop.views

import com.jqrgen.mvrxworkshop.coreMvRx.MvRxViewModel
import com.jqrgen.mvrxworkshop.models.ButtonCounterModelController

class LiveButtonsViewModel(
    initialState: LiveButtonsState
): MvRxViewModel<LiveButtonsState>(initialState) {

    init {
        observeButtonCounterModel()
    }

    fun incrementCounter() {
        // TODO: Use model directly
        withState { liveButtonState ->
            val newButtonCount = liveButtonState.buttonCounter + 1
            ButtonCounterModelController.updateButtonCounter(newButtonCount)
        }
    }

    private fun observeButtonCounterModel() {

    }

}