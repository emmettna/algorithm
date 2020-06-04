package datastructure.list

trait LinkedListInterface[A] {
  def isEmpty: Boolean

  def add(item: A): Unit

  def addLast(item: A): Unit

  def addFirst(item: A): Unit

  def addAt(index:Int, item:A): Unit

  def remove(): Unit

  def removeLast(): Unit

  def removeFirst(): Unit

  def removeAt(index:Int): Unit

  def peekFirst(): A

  def peekLast(): A

  def contains(item: A): Boolean

  def indexOf(item: A): Int

  def size(): Int
}
