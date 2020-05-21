package datastructure.queue

import model.Weighted

class PriorityQueue[A]() extends QueueInterface[Weighted[A]] {
  private var array = new Array[Weighted[A]](0)

  override def enqueue(elem: Weighted[A]): Unit = {
    array = {

      @scala.annotation.tailrec
      def compareWithHead(heads: Array[Weighted[A]], tails: Array[Weighted[A]]): Array[Weighted[A]] = {
        tails.headOption match {
          case Some(v) =>
            v compareTo elem match {
              case -1 => compareWithHead(heads.appended(tails.head), tails.tail)
              case _ => tails.reverse.appended(elem)
            }
          case None => heads.head compareTo elem match {
            case -1 => heads.appended(elem)
            case _ => heads.appended(elem).reverse
          }
        }
      }

      array.length match {
        case 0 => array.appended(elem)
        case 1 => compareWithHead(Array.empty, array.reverse).reverse
        case _ => compareWithHead(Array.empty, array.reverse).reverse
      }
    }
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