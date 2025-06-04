package problemsolving

fun main(){
    val input = readln()
    val result = if (checkIfPalindrome(input)) "It's palindrome" else "Not palindrome"

    println(result)
}

//AMA
fun checkIfPalindrome(input: String) : Boolean {
    val rev = input.reversed()
    return rev == input
}
