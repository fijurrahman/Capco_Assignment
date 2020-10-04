package com.capco

import scala.io.Source
import scala.util.Try
import com.capco.assignment1.util._

object Assignment {


  def main(args: Array[String]) = {

    val NUM = (1 to 26).toList
    val char = ('A' to 'Z').toList
    //Assognment 2
    val res1 = numberToLetters("20 5 19 20+4 15 13 5")
    println(res1)
    // Assignment 3
   // val words = "flow" #:: "flowers" #:: "flew" #:: "flag" #:: "fm" #:: LazyList.empty
    //val wordNeedtobeProcess: LazyList[String] = words.map(x=> allPrefix(3,x))
    //wordNeedtobeProcess foreach println
  }

}
