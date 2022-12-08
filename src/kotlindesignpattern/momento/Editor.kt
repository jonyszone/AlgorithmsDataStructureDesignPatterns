package kotlindesignpattern.momento

class Editor(private var content: String) {
   // private lateinit var content: String
    fun createState(): EditorState {
        return EditorState(content)
    }

    fun restore(state: EditorState) {
        content = state.content
    }
}