typealias SearchResults = MutableMap<String, MutableList<Pair<Int, Int>>>

class WordSearcher(private val lines: List<String>) {
    fun find(targetWords: List<String>): SearchResults {
        val results = mutableMapOf<String, MutableList<Pair<Int, Int>>>()

        targetWords.forEach {
            searchWord(it, results)
        }

        return results
    }

    private fun searchWord(targetWord: String, results: SearchResults) {
        lines.forEachIndexed { i, line ->
            searchWordHorizontal(i, line, targetWord, results)
            searchWordVertical(i, line, targetWord, results)
        }
    }

    private fun searchWordHorizontal(lineNumber: Int, line: String, targetWord: String, results: SearchResults) {
        val wordStart = line.indexOf(targetWord)
        if (wordStart > -1) {
            results[targetWord]?.add(lineNumber to wordStart)
                ?: let { results[targetWord] = mutableListOf(lineNumber to wordStart) }
        }
    }

    private fun searchWordVertical(lineNumber: Int, line: String, targetWord: String, results: SearchResults) {
        var wordLength: Int = targetWord.length
        line.forEachIndexed() { x, char ->
            val verticalSlice =
        }
    }
}
