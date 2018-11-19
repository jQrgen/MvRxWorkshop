package com.jqrgen.mvrxworkshop.views.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.withState
import com.jqrgen.mvrxworkshop.R
import com.airbnb.mvrx.activityViewModel

class CounterFragment: BaseMvRxFragment() {
    private val liveButtonsViewModel: CounterViewModel by activityViewModel ()
    private var incrementCounterButton: Button? = null
    private var counterText: TextView? = null

    // DevFest: Binds view aka res/layout/fragment_view_live_buttons.xml to this fragment.
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_view_live_buttons, container, false)

        incrementCounterButton = view.findViewById(R.id.button_increment_counter)
        counterText = view.findViewById(R.id.counter_text_view)
        listenToIncrementCounterButton()

        return view
    }

    // DevFest: Updates the State for this Fragment
    // TODO: DefFest: Breakpoint here and click the button
    private fun listenToIncrementCounterButton() {
        incrementCounterButton?.setOnClickListener {view ->
            liveButtonsViewModel.incrementCounter()
        }
    }

    // DevFest: Runs when liveButtonsState is updated in LiveButtonsViewModel
    // TODO: DefFest: Breakpoint here and click the button
    override fun invalidate() {
        withState(liveButtonsViewModel){ liveButtonState ->
            counterText?.text = liveButtonState.count.toString()
        }
    }
}