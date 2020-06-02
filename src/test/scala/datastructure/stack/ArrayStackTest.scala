package datastructure.stack

import suite.FunSuite

class ArrayStackTest extends FunSuite{
  val array = new ArrayStack[Int]
  test("array Test"){
    assert(array.isEmpty)
    array.push(1)
    array.push(2)

    assert(array.pop() == 2)
  }
}
