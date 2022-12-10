package kotlindesignpattern.momento

fun main ()  {
    val editor = Editor()
    val history = History()

    editor.setContent("A")
    editor.createState()?.let { history.push(it) }
    editor.setContent("B")
    editor.createState()?.let { history.push(it) }
    editor.setContent("C")

    editor.restore(history.pop())

    println(editor.getContent())



}