package $package$.$name;format="lower,word"$

import org.scalatest.{FlatSpec, Matchers}

object $name;format="Camel,word"$Spec extends FlatSpec with Matchers {
  "foo" should "foo" in {
    assert("foo" == "foo")
  }
}
