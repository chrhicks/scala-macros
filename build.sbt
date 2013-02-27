name := "Macros"

organization := "com.chrhicks"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.0"

mainClass in (Compile, run) := Some("com.chrhicks.Main")

libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.10.0"