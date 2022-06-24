import datastructures.Queue

fun main (args: Array<String>) {
    val queue = Queue<Int>()
    queue.push(1)
    queue.push(2)
    queue.push(3)
    println("Queue size: ${queue.size}")
    println("Queue front: ${queue.getFront()}")
    println("Removing front: ${queue.pop()}")
    println("Queue size: ${queue.size}")
    println("Queue front: ${queue.getFront()}")
}