import sbt._

object Dependencies {

  val repos = Seq(
    "Local Maven Repo" at "file://" + Path.userHome.absolutePath + "/.m2/repository",
    "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases"
  )

  val scalaTest =
    "org.scalatest" %% "scalatest" % Version.scalaTest % "it, test"
  val scalaCheck =
    "org.scalacheck" %% "scalacheck" % Version.scalaCheck % "it, test"
}
