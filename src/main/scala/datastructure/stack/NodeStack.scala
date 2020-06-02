package datastructure.stack

import model.Node

class NodeStack[A] extends StackInterface[A] {
  var bottom: Node[A] = _
  var top: Node[A] = _

  override def push(item: A): Unit =
    if (top == null) {
      bottom = Node(item, null)
      top = bottom
    } else if (bottom.next == null) {
      bottom.next = Node(item, null)
      top = bottom.next
    } else {
      top.next = Node(item, null)
      top = top.next
      top.next = null
    }

  // Linked Node 가 아니면 구현 불가능
  override def pop(): A = {
    top.item
//    var prev: Node[A] = null
//
//    @scala.annotation.tailrec
//    def findPrev(n: Node[A]): Node[A] =
//      n match {
//        case s if s == null => null
//        case s if s.next == null => n
//        case s => findPrev(s.next)
//      }
//
//    prev = findPrev(bottom)
//
//
//
//    prev.item
  }

  override def isEmpty: Boolean = top == null

  override def size(): Int = {
    @scala.annotation.tailrec
    def count(d: Node[A], size: Int = 0): Int =
      d match {
        case null => size
        case _ => count(d.next, size + 1)
      }

    count(bottom)
  }
}
