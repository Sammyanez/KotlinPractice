package com.algoexpert.program

fun bubbleSort(array: MutableList<Int>): List<Int> {
    var swap = 1
    val size = array.size
    while(swap == 1){
        swap = 0
       for (i in array.indices) {
           if(i == size - 1) {
               break
           }
           if (array[i] > array[i + 1]){
               var b = array[i]
                   array[i] = array[i + 1]
               array[i + 1] = b
               swap = 1
           }
           else{
               continue
           }

       }
    }
    return array
}
