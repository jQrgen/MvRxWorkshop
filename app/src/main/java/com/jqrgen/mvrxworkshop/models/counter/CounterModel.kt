package com.jqrgen.mvrxworkshop.models.counter

import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

data class CounterModel (
    var count: Int = 0,
    val subject: Subject<Int> = PublishSubject.create()

)