package datastructures

class Trie {
    private class Node(var isWord: Boolean = false, var letters: MutableMap<Char, Node> = mutableMapOf()) {
        fun join(letter: Char) {
            letters[letter] = Node()
        }
    }

    private var root = Node()

    private fun exist(node: Node, letter: Char) = node.letters.contains(letter)

    fun add(word: String) {
        var currNode = root
        word.forEach { letter ->
            run {
                if (!exist(currNode, letter))
                    currNode.join(letter)
                currNode = currNode.letters[letter]!!
            }
        }
        currNode.isWord = true
    }

    fun search(word: String) : Boolean {
        var currNode = root
        word.forEach { letter ->
            run {
                if (!exist(currNode, letter))
                    return false
                currNode = currNode.letters[letter]!!
            }
        }
        return currNode.isWord
    }
}