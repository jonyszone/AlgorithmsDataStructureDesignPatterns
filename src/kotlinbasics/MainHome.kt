package kotlinbasics

class MainHome {
    val name: String = "Shafi"
    val mail: String = "mail.com"

    fun printInfo(){
        println("Name: $name\nMail: $mail")
    }

}

fun main(){
    val arrList = listOf(4, 1, 2, 3)
    sort(arrList.sorted())
    println(arrList.sortedDescending())
}

fun sort(intList: List<Int>) {
    for (arr in intList){
        print("$arr ")
    }
}