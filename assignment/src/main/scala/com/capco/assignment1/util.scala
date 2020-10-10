package com.capco.assignment1

import scala.collection.immutable.{HashMap, Queue}
import scala.util.Try

object util {
  // THIS IS CONSTANT VARIABLE WILL BE USED TO BUILD LETTER TABLE
  val NUM = (1 to 26).toList
  val charList = ('A' to 'Z').toList

  val letterTable = (NUM zip charList).toMap

  // This METHOD USED TO FIND THE LETTER IN GIVEN NUMBERS
  def buildLetterTable(number: Int) = {
    val tblres =
      number match {
        case num
          if (num > 0 && num <= 26) =>
          letterTable.get(num).get
        case _ => "UNKNOWN NUMBER"
      }

    tblres.toString
  }
  // HELPER CLASS TO BUILD LETTERS
  def numberToLetters(letters: String) = {
    var res = new StringBuilder

      letters.split("\\+").toList.foreach(x=> {
      x.split(" ").map(ch =>
      res.append(buildLetterTable(ch.toInt))
      )
      res.append(" ")
    }
    )
    res.mkString("")
  }


  def allPrefix(listofelement: LazyList[String],len: Int) = {
     lazy val result = scala.collection.mutable.Set[String]()
     listofelement.foreach(element => {
      element  match {
        case e if e.length > len =>  result.add(e.substring(0,3)+",")
        case _ => "Prefix Not Matched"
      }
    })
    result
  }


}
