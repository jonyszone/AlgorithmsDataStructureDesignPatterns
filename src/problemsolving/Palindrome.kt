package problemsolving

import problemsolving.PalindromeCheck.isPalindrome

fun main(){
    val input = readln().toInt()
    //val result = if (checkIfPalindrome(input)) "It's palindrome" else "Not palindrome"

    val result = if (isPalindrome(input)) "It's palindrome" else "Not palindrome"
    println(result)
}

//AMA
fun checkIfPalindrome(input: String) : Boolean {
    val rev = input.reversed()
    return rev == input
}

fun isItPalindrome(num: Int): Boolean {
    if (num < 0) return false  // Negative numbers are not palindromes
    if (num in 0..9) return true  // Single-digit numbers are palindromes

    var original = num
    var reversed = 0

    while (original > 0) {
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }

    return num == reversed
}
