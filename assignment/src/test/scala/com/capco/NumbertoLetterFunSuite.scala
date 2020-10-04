package com.capco


import com.capco.assignment1.util.numberToLetters
import org.scalatest.{FlatSpec, Matchers}

class NumbertoLetterFunSuite extends FlatSpec with Matchers{

  "A matcher" should  "Equaliy" in{
    val string="TEST DOME"
    val str = numberToLetters("20 5 19 20+4 15 13 5")
    string shouldEqual(str)
  }

}
