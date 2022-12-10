package kotlindesignpattern.momento

class Editor() {

    private var content: String? = null
    fun getContent(): String? {
        return content
    }

    fun setContent(content: String?) {
        this.content = content
    }

    fun createState(): EditorState? {
        return content?.let { EditorState(it) }
    }

    fun restore(state: EditorState) {
        content = state.content
    }
}