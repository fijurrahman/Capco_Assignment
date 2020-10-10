package com.capco

import scala.io.Source
import scala.util.Try
import com.capco.assignment1.util._

object Assignment {


  def main(args: Array[String]) = {

    //Assognment 2
    val res1 = numberToLetters("20 5 19 20+4 15 13 5")
    println(res1)

    /*val lst = List(2,5,88,3)
    for(i <- lst){

    }*/
    // Assignment 3
   val words = "flow" #:: "flowers" #:: "flew" #:: "flag" #:: "fm" #:: LazyList.empty
   allPrefix(words,3).foreach(println)
    //wordNeedtobeProcess foreach println
  }

}
