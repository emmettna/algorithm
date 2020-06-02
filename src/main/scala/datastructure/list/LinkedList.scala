package datastructure.list

import model.DoublyNode

class LinkedList[A] extends LinkedListInterface[A] {
  var list: DoublyNode[A] = null

  var first: DoublyNode[A] = null

  var last: DoublyNode[A] = null

  override def isEmpty: Boolean = list == null

  override def add(item: A): Unit = addLast(item)

  override def addLast(item: A): Unit = list

  override def addFirst(item: A): Unit = ???

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
