import datastructures.Stack

fun main (args: Array<String>) {
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println("Stack size: ${stack.size}")
    println("Top node: ${stack.getTop()}")
    println("Removing top node: ${stack.pop()}")
    println("Stack size: ${stack.size}")
    println("Top node: ${stack.getTop()}")
}