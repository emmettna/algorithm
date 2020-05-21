package model

final case class Weighted[A](elem: A, priority: Int) extends Comparable[Weighted[A]] {
  override def compareTo(o: Weighted[A]): Int = {
    priority compareTo (o: Weighted[A]).priority
  }

}