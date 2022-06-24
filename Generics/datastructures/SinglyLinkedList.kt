package datastructures

class SinglyLinkedList<T> {
    private class Node<T>(var data: T? = null, var next: Node<T>? = null) {}

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0

    override fun toString(): String {
        var list = ""
        var currNode = head
        while (currNode != null) {
            list += "${currNode.data} -> "
            currNode = currNode.next
        }
        return list
    }

    fun add(data: T) {
        val newNode = Node(data)
        size++
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail!!.next = newNode
            tail = newNode
        }
    }

    fun getHead(): T? {
        return head?.data ?: throw Error("Linked List is Empty")
    }

    fun getTail(): T? {
        return tail?.data ?: throw Error("Linked List is Empty")
    }

    fun getValueAt(index: Int) : T? {
        if (index >= size)
            throw Error("Index $index does not exist")
        var currentNode = head
        for (i in 0 until index)
            currentNode = currentNode!!.next
        return currentNode!!.data
    }

    fun removeAt(index: Int) : T? {
        if (index >= size)
            throw Error("Index: $index does not exist")
        var currentNode = head
        var prevNode: Node<T>? = null
        for (i in 0 until index) {
            prevNode = currentNode
            currentNode = currentNode!!.next
        }
        if (prevNode == null) {
            head = head!!.next
        } else if (currentNode == null) {
            tail = prevNode
            prevNode.next = null
        } else {
            prevNode.next = currentNode.next
            currentNode.next = null
        }
        size--
        return currentNode!!.data
    }
}