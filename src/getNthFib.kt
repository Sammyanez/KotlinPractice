fun getNthFib(n: Int): Int { // Write your code here.
    if (n == 0){
        return 1
    } else if (n == 1){
        return 0
    } else{
        return getNthFib(n-1) + getNthFib(n-2)
    }
}

