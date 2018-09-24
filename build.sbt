name := "daytrader-root"

organization in ThisBuild := "ai.daytrader"

scalaVersion in ThisBuild := "2.12.6"

version in ThisBuild := "0.0.1-SNAPSHOT"

publishArtifact := false

lazy val root =
  (project in file("."))
  .aggregate(`daytrader-data`)
  .aggregate(`daytrader-ticker`)

lazy val `daytrader-data` = ProjectRef(file("daytrader-data"), "daytrader-data")

lazy val `daytrader-ticker` = ProjectRef(uri("daytrader-ticker"),"daytrader-ticker")

fork in ThisBuild := true

resolvers in ThisBuild ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

