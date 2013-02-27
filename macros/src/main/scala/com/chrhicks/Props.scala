package com.chrhicks

import language.experimental.macros
import reflect.macros.Context

object Props {
  def getValue[T](obj: T, prop: String): Any = macro getValueImpl[T]

  def getValueImpl[T: c.WeakTypeTag](c: Context)(obj: c.Expr[T], prop: c.Expr[String]): c.Expr[Any] = {
    import c.universe._
    val Literal(Constant(name: String)) = prop.tree

    c.Expr[Any](  Select(obj.tree, newTermName(name))   )
  }
}
