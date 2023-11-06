fun main(args: Array<String>) {

    //Linkedlist test
    println("\nLinked List Part")
    val linkedList = LinkedList<Int>()
    linkedList.addFirst(1)
    linkedList.addFirst(42)
    linkedList.addFirst(65)
    linkedList.addLast(2)
    linkedList.addLast(3)
    println(linkedList)
    println("Size: ${linkedList.size()}")

    linkedList.remove(2)
    println(linkedList)
    println("Size: ${linkedList.size()}")

    println("Value at index 2 of the linked list")
    println(linkedList.get(2))

    //Doubled Linked list

    println("\n\nDoubled Linked List Part")
    val doublyLinkedList = DoublyLinkedList<String>()

    doublyLinkedList.addFirst("1")
    doublyLinkedList.addLast("2")
    doublyLinkedList.addLast("3")
    doublyLinkedList.addFirst("7")
    println(doublyLinkedList)

    println("Size: ${doublyLinkedList.size()}")

    println("Value at index 2 of the doubled linked list")
    println(doublyLinkedList.get(2))

    doublyLinkedList.remove("2")
    println(doublyLinkedList)
    println("Size: ${doublyLinkedList.size()}")


    doublyLinkedList.addFirst("55")
    doublyLinkedList.addLast("62")
    println(doublyLinkedList)

    //Stack test
    println("\n\nStackk Part")

    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack)
    println("Size: ${stack.size()}")

    println("Value at index 2 of the stack")
    println(stack.get(2))

    println("Popped: ${stack.pop()}")
    println(stack)
    println("Size: ${stack.size()}")

    println("Peek: ${stack.peek()}")
    println("Is stack empty? ${stack.isEmpty()}")
}