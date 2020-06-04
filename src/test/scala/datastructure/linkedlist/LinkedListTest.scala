package datastructure.linkedlist

import datastructure.list.LinkedList
import suite.FunSuite

class LinkedListTest extends FunSuite{
  test("" ){
    val list = new LinkedList[Int]
    list.add(1)

    println(list.first)
    println(list.last)

    list.add(2)
    println(list.first.item)
    println(list.last.item)

    list.add(3)
    println(list.first.item)
    println(list.first.next.item)
    println(list.first.next.next.item)
    println(list.last.item)

    list.addFirst(4)
    println(list.first.item)
    println(list.last.item)

    list.remove()
    println(list.last.item)
    println(list.last.next.item)

  }
}
