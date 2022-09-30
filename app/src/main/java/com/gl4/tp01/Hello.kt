package com.gl4.tp01

import java.lang.Math.abs

fun main(args:Array<String>) {
  println("Hello")
  var p = Point(2,3);
  var q = Point(5,5);
  // println(distance(p,q));
  val RectangleArray = arrayOf(Rectangle(), Rectangle(p= Point(2,3)), Rectangle(q = Point(4,5)))
  RectangleArray.forEach {
    println(it.surface())
  }
}

fun distance(p: Point,q:Point): Int {
  return (abs((p.x - q.x)) + abs((p.y - q.y)))
}