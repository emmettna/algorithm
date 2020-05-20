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
    queue.enqueue(aunt)
    queue.enqueue(dad)

    queue.dequeue() shouldBe dad

  }
}
