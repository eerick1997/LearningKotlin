import datastructures.Trie

fun main(args: Array<String>) {
    val trie = Trie()
    trie.add("gato")
    trie.add("gata")
    trie.add("gaton")
    trie.add("ganzo")
    trie.add("perro")
    val word = "gat"
    println("Exist $word?: ${trie.search(word)}")
}