/**
 * Created by alexanderpoulsen on 17/08/15.
 */

import scala.annotation.tailrec
import scala.collection.JavaConversions._

class Scala {

}

object Scala {

  def test(): String = {
    "Hello, world";
  }
  def testint(args: java.util.List[String]) : Unit = {

    args.reverse.foreach(println)
  }

  def sumint(args: java.util.List[Integer]) : Int = {
    args.foldLeft(0)((x,y) => x + y)
  }

  def sum(xs: Array[Int]): Int = {
    @tailrec
    def inner(xs: List[Int], accum: Int): Int = {
      xs match {
        case x :: rest => inner(rest, accum + x)
        case Nil => accum
      }
    }
    inner(xs.toList, 0)
  }
}
