package com.jqrgen.mvrxworkshop.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.mvrx.BaseMvRxFragment
import com.jqrgen.mvrxworkshop.R

class LiveButtonsFragment: BaseMvRxFragment() {

    // DevFest: Binds res/layout/fragment_view_live_buttons.xml to this fragment.
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_view_live_buttons, container, false)

        return view
    }

    // DevFest: Runs when liveButtonsState is updated in LiveButtonsViewModel
    // TODO: Breakpoint here and click a button experiment
    override fun invalidate() {

    }
}