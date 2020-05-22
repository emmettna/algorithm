package datastructure.queue

import suite.FunSuite

class LinkedQueueTest extends FunSuite{

  test("") {
    val queue = new LinkedQueue[Int]

    queue.size() shouldBe 0

    queue.enqueue(0)

    queue.size() shouldBe 1
    queue.peek() shouldBe 0

    queue.enqueue(1)
    queue.enqueue(2)
    queue.dequeue() shouldBe 0
    queue.dequeue() shouldBe 1
    queue.dequeue() shouldBe 2

    queue.isEmpty() shouldBe false
  }
}
