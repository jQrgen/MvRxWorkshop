package com.jqrgen.mvrxworkshop.models.color

import android.graphics.Color
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

data class ColorModel (
    var color: Int = Color.RED,
    val subject: Subject<Int> = PublishSubject.create()
)