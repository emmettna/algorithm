package datastructure.stack

import suite.FunSuite

class NodeStackTest extends FunSuite{
  val stack = new NodeStack[Int]

  test("stack test") {
    assert(stack.isEmpty)

    assert(stack.size() == 0)

    stack.push(1)
    assert(stack.size() == 1)
    assert(stack.pop() == 1)
    stack.push(2)
    assert(stack.size() == 2)
    stack.push(3)
    assert(stack.size() == 3)


  }

}
