
class DoublyLinkedList<T> {
    private var head: ListNodeDL<T>? = null
    private var tail: ListNodeDL<T>? = null
    private var size = 0

    fun addFirst(value: T) {
        val newNode = ListNodeDL(value, next = head)
        if (head != null) {
            head?.prev = newNode
        } else {
            tail = newNode
        }
        head = newNode
        size++
    }

    fun addLast(value: T) {
        if (head == null) {
            addFirst(value)
        } else {
            val newNode = ListNodeDL(value, prev = tail)
            tail?.next = newNode
            tail = newNode
            size++
        }
    }

    fun remove(value: T) {
        var current = head
        while (current != null) {
            if (current.value == value) {
                if (current.prev != null) {
                    current.prev?.next = current.next
                } else {
                    head = current.next
                }
                if (current.next != null) {
                    current.next?.prev = current.prev
                } else {
                    tail = current.prev
                }
                size--
                return
            }
            current = current.next
        }
    }

    fun removeAt(index: Int) {
        if (index < 0 || index >= size) {
            println("bounds error")
        }
        if (size == 1) {
            head = null
            tail = null
        } else if (index == 0) {

            head = head?.next
            head?.prev = null
        } else if (index == size - 1) {

            tail = tail?.prev
            tail?.next = null
        } else {

            var current: ListNodeDL<T>? = head
            for (i in 0..<index) {
                current = current?.next
            }
            current?.prev?.next = current?.next
            current?.next?.prev = current?.prev
        }

        size--
    }

    fun size(): Int {
        return size
    }

    fun get(index: Int): T? {

        if (index < 0 || index >= size) {
            println("Array bounds error!")
        }

        var current: ListNodeDL<T>?
        if (index < size / 2) {
            current = head
            for (i in 0..<index) {
                current = current?.next
            }
        } else {
            current = tail
            for (i in size - 1 downTo index + 1) {
                current = current?.prev
            }
        }
        return current?.value
    }

    override fun toString(): String {
        val elements = StringBuilder()
        var current = head
        while (current != null) {
            elements.append(current.value).append(" <-> ")
            current = current.next
        }
        return elements.append("null").toString()
    }
}
