package example

import org.scalatest._

class KataSpec extends FlatSpec with Matchers {
  "The Kata object" should "say world" in {
    Kata.hello shouldEqual "world"
  }

  "The Kata object" should "say Hello" in {
    Kata.hello("Hello") shouldEqual "Hello"
  }
}
