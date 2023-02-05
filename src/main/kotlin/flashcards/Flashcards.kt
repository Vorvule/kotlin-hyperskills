package flashcards

class Flashcards {
    fun play() {
        println("Input the number of cards:")
        val cardsCount = readln().toInt()

        var cards = mutableMapOf<String, String>()

        for (i in 0..cardsCount - 1) {
            println("Card #${i + 1}:")
            var key = ""

            while (key == "") {
                key = readln()
                if (key in cards.keys) {
                    println("The term \"$key\" already exists. Try again:")
                    key = ""
                }
            }

            println("The definition for card #${i + 1}:")
            var value = ""

            while (value == "") {
                value = readln()

                if (value in cards.values) {
                    println("The definition \"$value\" already exists. Try again:")
                    value = ""
                }
            }

            cards.put(key, value)
        }

        val terms: MutableSet<String> = cards.keys
        val definitions: MutableCollection<String> = cards.values

        for (i in 0..cardsCount - 1) {
            val term: String = terms.elementAt(i)
            val definition: String? = cards[term]

            println("Print the definition of \"$term\":")
            val answer = readln()

            if (answer == definition) {
                println("Correct!")
            } else {
                if (answer in definitions) {
                    val definitionIndex = definitions.indexOf(answer)
                    val anotherTerm = terms.elementAt(definitionIndex)
                    println("Wrong. The right answer is \"$definition\", but your definition is correct for \"$anotherTerm\".")
                } else {
                    println("Wrong. The right answer is \"$definition\".")
                }
            }
        }
    }
}