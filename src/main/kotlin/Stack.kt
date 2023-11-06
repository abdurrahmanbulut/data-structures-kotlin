class Stack<T> {

    private var top: ListNode<T>? = null
    private var size = 0

    fun push(value: T) {
        val newNode = ListNode(value)
        newNode.next = top
        top = newNode

        size++
    }

    fun pop(): T? {
        val value = top?.value
        if (top != null) {
            top = top?.next
            size--
        }
        return value
    }

    fun peek(): T? {
        return top?.value
    }

    fun isEmpty(): Boolean {
        return top == null
    }

    fun size(): Int {
        return size
    }

    fun get(index: Int): T? {

        if (index < 0 || index >= size) {
            println("Array bounds error!")
        }

        var current = top
        for (i in 0..< size - index - 1) {
            current = current?.next
        }
        return current?.value
    }

    override fun toString(): String {
        var current = top
        val elements = StringBuilder()

        while (current != null) {
            elements.append(current.value).append("\n")
            current = current.next
        }

        return elements.toString()
    }
}
