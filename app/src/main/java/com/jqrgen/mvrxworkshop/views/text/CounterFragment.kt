package com.jqrgen.mvrxworkshop.views.text

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.withState
import com.jqrgen.mvrxworkshop.R

class TextFragment: BaseMvRxFragment() {
    // TODO: create state, viewmodel and model
    /*
    Create a new view and model from scratch.
        Contents: TextView + Submit button
        View should have a textView connected to ViewModel
        Submit button creates/posts (CRUD) a new text message to the firebase realtime database. (firebaseReference.child("message").push(<MessageString>)

     */
    override fun invalidate() {

    }
}