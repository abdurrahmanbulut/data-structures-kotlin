
class LinkedList<T> {

    private var head: ListNode<T>? = null
    private var size = 0

    fun addFirst(value: T) {
        head = ListNode(value, head)
        size++
    }
    
    fun addLast(value: T) {
        if (head == null) {
            addFirst(value)
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = ListNode(value)
            size++
        }
    }

    fun remove(value: T) {
        if (head == null) return

        if (head?.value == value) {
            head = head?.next
            size--
            return
        }

        var current = head
        while (current?.next != null) {
            if (current.next?.value == value) {
                current.next = current.next?.next
                size--
                return
            }
            current = current.next
        }
    }

    fun removeAt(index: Int) {
        if (index < 0 || index >= size) {
            println("Boudns Error")
        }
        if (index == 0) {
            head = head?.next
        } else {
            var current = head
            for (i in 0..<index - 1) {
                current = current?.next
            }
            val temp = current?.next
            current?.next = temp?.next
        }
        size--
    }

    fun size(): Int {
        return size
    }

    fun get(index: Int): T? {

        if (index < 0 || index >= size) {
            println("Array bounds error!")
            return null
        }

        var current = head
        for (i in 0..<index) {
            current = current?.next
        }
        return current?.value
    }

    override fun toString(): String {
        var current = head
        val elements = StringBuilder()
        while (current != null) {
            elements.append(current.value).append(" -> ")
            current = current.next
        }
        return elements.append("null").toString()
    }
}
