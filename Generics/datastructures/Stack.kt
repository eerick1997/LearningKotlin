package datastructures

class Stack<T> {

    private class Node<T>(var data: T? = null, var prev: Node<T>? = null)

    private var topNode: Node<T>? = null
    var size = 0

    fun push(data: T) {
        val newNode = Node(data)
        if (size == 0)
            topNode = newNode
        else {
            newNode.prev = topNode
            topNode = newNode
        }
        size++
    }

    fun pop() : T? {
        if (size == 0)
            throw Error("Stack is empty")
        val data: T? = topNode!!.data
        topNode = topNode!!.prev
        size--
        return data
    }

    fun getTop() : T? = topNode?.data ?: throw Error("Stack is empty")
}