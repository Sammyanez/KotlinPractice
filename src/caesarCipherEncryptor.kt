fun caesarCipherEncryptor(string: String, key: Int): String {
    val newLetters = mutableListOf<Char>()
    val newKey = key % 26
    for(letter in string) {
        newLetters.add(getNewLetter(letter, newKey))
    }
    return newLetters.joinToString("")
}
fun getNewLetter(letter: Char, key: Int):Char{
    val newLetterCode = letter.toInt() + key
    return if(newLetterCode <=122) newLetterCode.toChar() else (96 + newLetterCode % 122).toChar()

}




/*fun caesarCipherEncryptor(string: String, key: Int): String {
    val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
    val length = string.length
    val array = IntArray(length)
    var myString: String = ""
    for(i in string.indices){
        for(j in alphabet.indices){
            if (string[i] == alphabet[j]) {
                array[i] = j
                break
            }
        }
    }
    for(x in array.indices){
        array[x] = array[x] + key
        while( array[x] > 25) {
            array[x] = array[x] - 26;
        }
        myString += alphabet[array[x]]
    }

    return myString;
} */