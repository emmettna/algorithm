package model

final case class DoublyNode[A](item: A, prev: DoublyNode[A], next: DoublyNode[A])
