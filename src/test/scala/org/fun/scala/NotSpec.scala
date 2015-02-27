package org.fun.scala

import org.specs2.mutable.Specification

class NotSpec extends Specification {

  val not: Not = new Not()
  "Logical Not" should {
    "for true parameter will return false" in {
      not(true) must beFalse
    }

    "for false parameter will return false" in {
      not(false) must beTrue
    }
  }
}
