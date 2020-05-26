package datastructure.stack

trait StackInterface[A] {
  def push(item: A): Unit

  def pop(): A

  def isEmpty: Boolean

  def size(): Int
}
