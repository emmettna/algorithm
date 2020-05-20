package datastructure.queue

import model.Weighted

class PriorityQueue[A]() extends QueueInterface[Weighted[A]] {
  private var array = new Array[Weighted[A]](0)

  override def enqueue(elem: Weighted[A]): Unit = {
    array = {
    // TODO handle empty head case
      @scala.annotation.tailrec
      def compareWithHead(array: Array[Weighted[A]]): Array[Weighted[A]] =
      array.head compareTo elem match {
        case 1 =>  array.reverse.appended(elem)
        case 0 => array.reverse.appended(elem)
        case -1 => compareWithHead(array.tail)
      }
      compareWithHead(array.reverse)
    }.reverse
  }

  override def peek(): Weighted[A] = array.head

  override def dequeue(): Weighted[A] = {
    val head = array.head
    array = array.tail
    head
  }

  override def isEmpty(): Boolean =
    array.isEmpty

  override def size(): Int =
    array.length
}