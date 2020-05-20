package datastructure

import model.{Item, Node}
import org.scalacheck.Prop._
import org.scalacheck.{Arbitrary, Properties}

import scala.util.Try

class BagsTest extends Properties("Bags"){

  implicit val itemImplicit: Arbitrary[Item] = Arbitrary(Item())
  implicit val itemNodeImplicit: Arbitrary[Node[Item]] = Arbitrary(Node[Item](Item(), null))

  property("Add") = forAll { (a: Node[Item], b: Item) =>
    val bags = new Bags(a.item)
    Try(bags.add(b)).toOption.isDefined
  }

  property("Size") = forAll { (a: Node[Item], b: Item) =>
    val bags = new Bags(a.item)
    bags.size() == 1
  }


}
