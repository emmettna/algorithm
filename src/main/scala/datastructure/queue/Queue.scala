package datastructure.queue

import scala.reflect.{ClassManifest, ClassTag}

class Queue[A: ClassTag](capacity: Int) {
  var array = new Array[A](0)

  def insert(x: A): Unit = {
    array.length match {
      case size if size >= capacity => ()
      case _ =>
        array = array.appended(x)
        ()
    }
  }

  def remove(): Unit = {
    array.length match {
      case s if s != 0 =>
        array = array.tail
        ()
      case _ => ()
    }

  }

  def front(): A = array.head

  def rear(): A = array.reverse.head

  def isEmpty: Boolean = array.isEmpty

  def isFull: Boolean = array.length == capacity

  def size(): Int = array.length
}
