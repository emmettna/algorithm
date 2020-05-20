package datastructure.queue

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class QueueTest extends AnyFunSuite with Matchers {
  test("insert"){

    val queue = new Queue[Int](10)

    queue.insert(1)

    queue.front() shouldBe 1
  }

  test("remove") {
    val queue = new Queue[Int](10)
    queue.insert(1)

    queue.remove()
    queue.size() shouldBe 0
  }

  test("front") {
    val queue = new Queue[Int](10)

    queue.insert(1)
    queue.insert(2)

    queue.front() shouldBe 1
  }
  test("rear") {
    val queue = new Queue[Int](10)

    queue.insert(1)
    queue.insert(2)

    queue.rear() shouldBe 2
  }
  test("isEmpty") {
    val queue = new Queue[Int](10)
    queue.isEmpty shouldBe true

    queue.insert(1)

    queue.isEmpty shouldBe false
  }
  test("isFull") {
    val queue = new Queue[Int](1)
    queue.insert(1)

    queue.isFull shouldBe true
  }
  test("size") {
    val queue = new Queue[Int](3)

    queue.size() shouldBe 0
  }
}
