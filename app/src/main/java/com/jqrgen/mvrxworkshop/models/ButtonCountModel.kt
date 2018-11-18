package com.jqrgen.mvrxworkshop.models

import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

data class ButtonCountModel (
    var count: Int = 0,
    val subject: Subject<Int> = PublishSubject.create()

)