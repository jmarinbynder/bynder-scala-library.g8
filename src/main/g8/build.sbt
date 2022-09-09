import Dependencies._

ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "3.2.0"

lazy val `$name;format="norm"$` = (project in file(".")).settings(
  ThisBuild / dynverSonatypeSnapshots := true,
  name := "$name$",
  libraryDependencies ++= Seq(scalaTest, scalaCheck)
)
