import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `It finds occurrences of a single word on the x axis`() {
        val wordSearcher = WordSearcher(listOf(
            "ABCDOGFGH",
            "DOGAAAAAA",
            "BCBCBCDOG",
        ))
        val result: SearchResults = wordSearcher.find(listOf("DOG"))
        assertEquals(mapOf(
            "DOG" to listOf(0 to 3, 1 to 0, 2 to 6)
        ), result)
    }

    @Test
    fun `It finds occurrences of a multiple words on the x axis`() {
        val wordSearcher = WordSearcher(listOf(
            "ABCDOGFGH",
            "DOGAAACAT",
            "BCBCBCCAT",
        ))
        val result: SearchResults = wordSearcher.find(listOf("DOG", "CAT"))
        assertEquals(mapOf(
            "DOG" to listOf(0 to 3, 1 to 0),
            "CAT" to listOf(1 to 6, 2 to 6)
        ), result)
    }

    @Test
    fun `It finds occurrences of a single word on the Y axis`() {
        val wordSearcher = WordSearcher(listOf(
            "DAAA",
            "OADA",
            "GAOA",
            "AAGA",
        ))
        val result: SearchResults = wordSearcher.find(listOf("DOG"))
        assertEquals(mapOf(
            "DOG" to listOf(0 to 0, 1 to 2)
        ), result)
    }
}
