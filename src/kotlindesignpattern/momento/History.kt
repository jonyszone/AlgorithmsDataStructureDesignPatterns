package kotlindesignpattern.momento

class History {
    private val states: MutableList<EditorState> = ArrayList()

    fun push(state: EditorState) {
        states.add(state)
    }

    fun pop(): EditorState {
        val lastIndex = states.size - 1
        val lastState = states[lastIndex]
        states.remove(lastState)
        return lastState
    }
}