fun selectionSort(array: MutableList<Int>): List<Int> {
    // Write your code here.
    for (i in array.indices) {
        var smallest = array[i]
        var smallestIndx = i
        for( j in i until  array.size) {
        if (smallest > array[j]) {
            smallest = array[j]
            smallestIndx = j
        }
    }
        val temp = array[i]
        array[i] = array[smallestIndx]
        array[smallestIndx] = temp


    }
    return array;
}