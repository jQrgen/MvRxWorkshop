package com.jqrgen.mvrxworkshop.models.color

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.jqrgen.mvrxworkshop.models.counter.CounterModelController
import io.reactivex.Observable

object ColorModelController {
    private val colorReference = FirebaseDatabase.getInstance().getReference("color")

    fun create() {}

    fun read() {}

    fun update(newColor: Int) {}

    fun delete() {}

    fun observable(): Observable<Int> {
        return Observable.create<Int> { emitter ->

        }
    }

}