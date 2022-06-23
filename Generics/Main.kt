import datastructures.SinglyLinkedList

fun main (args: Array<String>) {
    val singlyLinkedList = SinglyLinkedList<Int>()
    singlyLinkedList.add(1)
    singlyLinkedList.add(2)
    singlyLinkedList.add(3)
    println("Size: ${singlyLinkedList.size}")
    println(singlyLinkedList.toString())
    println("Head: ${singlyLinkedList.getHead()}")
    println("Tail: ${singlyLinkedList.getTail()}")
    println("Erased: ${singlyLinkedList.removeAt(1)}")
    println(singlyLinkedList.toString())
    println("Value at: ${singlyLinkedList.getValueAt(0)}")
}