package org.arhor.photospot.accountanttelegrambot.util

internal inline val <reified T> Iterable<T>.tail: Array<T>
    get() = drop(1).toTypedArray()

internal val <T> Iterable<T>.head: T
    get() = first()