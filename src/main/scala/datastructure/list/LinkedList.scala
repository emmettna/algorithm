package datastructure.list

import model.DoublyNode

class LinkedList[A] extends LinkedListInterface[A] {
  var first: DoublyNode[A] = null

  var last: DoublyNode[A] = null

  override def isEmpty: Boolean = first == null

  override def add(item: A): Unit = addLast(item)

  override def addLast(item: A): Unit = (first, last) match {
    case (null, null) =>
      first = DoublyNode(item, null, last)
    case (_ , null) =>
      last = DoublyNode(item, first, null)
      first.next = last
  }

  override def addFirst(item: A): Unit = first match {
    case null =>
      first = DoublyNode(item, null, null)
    case _ =>
      val second = first.next
      val prev = DoublyNode(item, null, first)
      first = prev
  }

  override def addAt(index: Int, item: A): Unit = ???

  override def remove(): Unit = ???

  override def removeLast(): Unit = ???

  override def removeFirst(): Unit = ???

  override def removeAt(index: Int): Unit = ???

  override def peekFirst(): A = ???

  override def peekLast(): A = ???

  override def contains(item: A): Boolean = ???

  override def indexOf(item: A): Int = ???
}
