package datastructures

class Queue<T> {
    class Node<T>(var data: T? = null, var prev: Node<T>? = null) {}
    private var front: Node<T>? = null
    private var end: Node<T>? = null
    var size = 0

    fun push(data: T) {
        val newNode = Node(data)
        if (size == 0) {
            front = newNode
            end = newNode
        } else {
            end!!.prev = newNode
            end = newNode
        }
        size++
    }

    fun pop() : T? {
        if (size == 0)
            throw Error("Queue is empty")
        if (size == 1)
            end = null
        val data = front!!.data
        front = front!!.prev
        size--
        return data
    }

    fun getFront() : T? = front?.data ?: throw Error("Queue is empty")
}