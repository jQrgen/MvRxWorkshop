package com.jqrgen.mvrxworkshop.models.counter

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import io.reactivex.Observable

object CounterModelController {
    private val counterReference = FirebaseDatabase.getInstance().getReference("counter")

    // Init singleton instance of chatSessionsModel here.
    private val counterModel = CounterModel()

    fun create(){}

    fun read() {
        val counterEventListener = object: ValueEventListener {
            override fun onCancelled(error: DatabaseError) { println(error) }

            override fun onDataChange(counterSnapShot: DataSnapshot) {
                counterModel.count = counterSnapShot.getValue(Int::class.java) ?: return
            }
        }

        counterReference.addListenerForSingleValueEvent(counterEventListener)
    }

    fun update(newButtonCount: Int) {
        // 1. Updates model
        counterModel.count = newButtonCount
        // 2. Updates Db (Notice what Db we are using is hidden from the ViewModel)
        counterReference.setValue(newButtonCount)
        // 3. Notifies subscribers
        counterModel.subject.onNext(newButtonCount)
    }

    fun delete() {}

    fun observable(): Observable<Int> {
        // DevFest: Uses Obserable from ReactiveX framework which is included in the MvRx framework.
        return Observable.create<Int> { emitter ->

            // Emits current locally stored value to subscribers
            emitter.onNext(counterModel.count)

            // Emits changes to model
            counterModel.subject.subscribe{ count ->
                emitter.onNext(count)
            }

            val counterEventListener = object: ValueEventListener {
                override fun onCancelled(error: DatabaseError) { println(error) }

                override fun onDataChange(counterSnapShot: DataSnapshot) {
                    val count = counterSnapShot.getValue(Int::class.java) ?: return
                    counterModel.count = count
                    emitter.onNext(count)
                }
            }

            // Gets and emits latest value from firebase realtime database
            counterReference.addListenerForSingleValueEvent(counterEventListener)

            // Observes latest value from firebase realtime database
            counterReference.addValueEventListener(counterEventListener)
        }
    }

}