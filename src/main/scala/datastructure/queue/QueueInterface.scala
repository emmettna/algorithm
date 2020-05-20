package datastructure.queue

trait QueueInterface[A] {
  def enqueue(elem: A): Unit

  def peek(): A

  def dequeue(): A

  def isEmpty(): Boolean

  def size(): Int
}
