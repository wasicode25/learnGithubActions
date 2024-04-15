lazy val baseSettings = Seq(
    scalaVersion := "2.12.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

lazy val servipagos = (project in file("servipagos"))
  .settings(baseSettings)
  .settings(name := "servipagos")


lazy val otros = (project in file("otros"))
  .settings(baseSettings)
  .settings(name := "otros")


lazy val multiModule = (project in file("."))
  .aggregate(servipagos, otros)
  .settings(name := "sbt-multi-module")
  .settings(baseSettings)

Test /scalaSource  := Seq(
  baseDirectory.value / "servipagos/tests",
  baseDirectory.value / "otros/tests"
)

Compile / scalaSource := Seq(
  baseDirectory.value / "servipagos/src",
  baseDirectory.value / "otros/src"
)