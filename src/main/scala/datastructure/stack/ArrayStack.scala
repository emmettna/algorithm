package datastructure.stack

import scala.reflect.ClassTag

class ArrayStack[A:ClassTag] extends StackInterface[A] {
  private var array = new Array[A](0)

  override def push(item: A): Unit = {
    array = array.appended(item)
  }

  override def pop(): A = {
    val res = array.reverse.head
    array = array.take(array.length)
    res
  }

  override def isEmpty: Boolean = array.length == 0

  override def size(): Int = array.length
}
