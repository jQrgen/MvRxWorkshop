package com.jqrgen.mvrxworkshop.models

import com.google.firebase.database.FirebaseDatabase
import io.reactivex.Observable

object ButtonCounterModelController {
    private val buttonCounterReference = FirebaseDatabase.getInstance().getReference("buttonCounter")

    // DevFest: init singleton instance of chatSessionsModel here.
    private val buttonCounterModel = ButtonCounterModel()

    fun observable(): Observable<Int>{
        // DevFest: Usese Obserable from ReactiveX framework which is inclusded in the MvRx framework.
        return Observable.create<Int> { obervableEmitter ->

            // DevFest: Emits current locally stored value to subscribers
            obervableEmitter.onNext(buttonCounterModel.buttonCount)

            // DevFest: Emits current value stored in firebase realtime database to subscribers

            // DevFest: Listens for buttonCount value change in realtime firebase database.

            // TODO: observe firebase and add here.
        }
    }

    fun updateButtonCounter(newButtonCount: Int) {
        buttonCounterModel.buttonCount = newButtonCount
        buttonCounterReference.setValue(newButtonCount)
    }
}