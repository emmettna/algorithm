package datastructure.queue

import model.Node

class LinkedQueue[A]() extends QueueInterface[A] {

  private var sizeTemp = 0

  private var front: Node[A] = null

  private var rear: Node[A] = null

  override def enqueue(elem: A): Unit = {
    sizeTemp match {
      case 0 =>
        val node = Node(elem, null)
        front = node
        rear = node
        sizeTemp += 1
      case 1 =>
        val node = Node(elem, null)
        rear.next = node
        rear = node
        sizeTemp += 1
      case _ =>
        val node = Node(elem, null)
        rear.next = node
        sizeTemp += 1
    }
  }

  override def peek(): A = front.item

  override def dequeue(): A = {
    val res = front
    front = front.next
    res.item
  }

  override def isEmpty(): Boolean = size == 0

  override def size(): Int = sizeTemp
}
