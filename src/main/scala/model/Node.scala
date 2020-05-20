package model

final case class Node[A](item: A, var next: Node[A])
