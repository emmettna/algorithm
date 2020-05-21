package datastructure.queue

import model.Weighted
import suite.FunSuite

class PriorityQueueTest extends FunSuite{

  test("Priority test"){
    val queue = new PriorityQueue[String]

    val son = Weighted[String]("Son", 1)
    val aunt = Weighted[String]("Aunt", 5)
    val dad = Weighted[String]("Dad", 10)

    queue.enqueue(son)
    println("inqueed son")
    queue.enqueue(aunt)
    println("inqueed aunt")
    queue.enqueue(dad)
    println("inqueed dad")

    queue.dequeue() shouldBe dad

  }
}
