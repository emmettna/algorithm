package model

final case class DoublyNode[A](var item: A, var prev: DoublyNode[A], var next: DoublyNode[A])
