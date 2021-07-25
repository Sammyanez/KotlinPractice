package com.algoexpert.program

fun insertionSort(array: MutableList<Int>): List<Int> {
    val length = array.size
    for (i in array.indices){
        if (i != length-1) {
            if (array[i] > array[i+1]) {
                val c = array[i]
                array[i] = array[i+1]
                array[i+1] = c
            }
        }
        for ( j in i downTo 0) {
        if (j-1 == -1) {
            break
        }
        if (array[j] < array[j-1]) {
            val b = array[j]
            array[j] = array[j-1]
            array[j-1] = b
        } else {
            continue
        }
    }

    }
    return array
}
