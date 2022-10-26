package serie2

class Node<E> {
    var previous: Node<E>? = null
    var next: Node<E>? = null
    var value: E? = null
}

fun <E> intersection(list1: Node<E>, list2: Node<E>, cmp: Comparator<E>): Node<E>? {
   TODO()
}

fun <E> getKBiggest(list: Node<E>?, k: Int): E? {
   TODO()
}

fun <E> quicksort(first: Node<E>?, last: Node<E>?, cmp: Comparator<E>) {
   TODO()
}

