package com.chrhicks

import language.experimental.macros
import reflect.runtime.universe._

object Main extends App {

  class Person(val name: String, val age: Int)
  val me = new Person("chicks", 27)
  val tree = reify(me.name)

  println(Props.getValue[Person](me, "age"))
}
