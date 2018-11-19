package com.jqrgen.mvrxworkshop.views.color

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.withState
import com.jqrgen.mvrxworkshop.R
import com.airbnb.mvrx.activityViewModel

class ColorFragment: BaseMvRxFragment() {
    private val colorViewModel: ColorViewModel by activityViewModel ()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_view_color, container, false)


        return view
    }

    override fun invalidate() {

        // TODO: DevFest update view using data from viewModel
        // User this method to get state here:
        withState(colorViewModel){ colorState ->

        }
    }

}