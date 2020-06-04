package datastructure.list

import model.DoublyNode

class LinkedList[A] extends LinkedListInterface[A] {
  var first: DoublyNode[A] = null

  var last: DoublyNode[A] = null

  override def isEmpty: Boolean = first == null

  override def add(item: A): Unit = addLast(item)

  override def addLast(item: A): Unit = isEmpty match {
    case true =>
      first = DoublyNode(item, null, last)
      last = first
    case false =>
      last.next = DoublyNode(item, last, null)
      last = last.next
  }

  override def addFirst(item: A): Unit = (first, last) match {
    case (null, null) =>
      first = DoublyNode(item, null, last)
      last = first
    case (f, null ) =>
      val temp = first
      first = DoublyNode(item, null, null)
      first.next = temp
    case (_, _ ) =>
      first = DoublyNode(item, null, first)
  }

  override def addAt(index: Int, item: A): Unit = ???

  override def remove(): Unit = removeLast()

  override def removeLast(): Unit = {
    last = last.prev
    last.next = null
  }

  override def removeFirst(): Unit = {
    first = first.next
    first.prev = null
  }

  override def removeAt(index: Int): Unit = {

    @scala.annotation.tailrec
    def callNext(i: Int, node: DoublyNode[A]):DoublyNode[A] = {
      i match {
        case 0 => node
        case _ => callNext(i - 1, node.next)
      }
    }
    callNext(index, first) // TODO continue
  }

  override def peekFirst(): A = first.item

  override def peekLast(): A = last.item

  override def contains(item: A): Boolean = ???

  override def indexOf(item: A): Int = ???

  override def size(): Int = ???
}
