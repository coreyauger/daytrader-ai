import sbt.Keys._

name := "daytrader-ticker"

version := "0.0.1-SNAPSHOT"

organization := "ai.daytrader"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= deps

scalaVersion := "2.12.6"

fork := true

lazy val deps = {
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )
}


