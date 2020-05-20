package datastructure

import model.{Item, Node}

import scala.util.Try

class Bags(item: Item) extends Iterable[Item] {
  var first: Node[Item] = Node[Item](item, null)

  override def iterator: Iterator[Item] = new Iterator[Item] {
    override def hasNext: Boolean = first != null

    override def next(): Item = first.next.item
  }

  def add(item: Item): Unit = {
    first.next = Node(item, null)
    ()
  }

  override def isEmpty(): Boolean = first.item == null

  override def size(): Int = {
    @scala.annotation.tailrec
    def counter(node: Node[Item], count: Int): Int = {
      Try(node.next).toOption match {
        case Some(v) => counter(v, count + 1)
        case None => count
      }
    }

    Try(first).toOption match {
      case Some(v) => counter(v.next, 1)
      case None => 0
    }
  }


}
