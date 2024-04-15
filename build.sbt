lazy val baseSettings = Seq(
    scalaVersion := "2.12.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

lazy val servipagos = (project in file("servipagos"))
  .settings(baseSettings)
  .settings(name := "servipagos")
  .settings(
    Test / scalaSource  := baseDirectory.value / "servipagos/test",
    Compile / scalaSource  := baseDirectory.value / "servipagos/src"
  )

lazy val otros = (project in file("otros"))
  .settings(baseSettings)
  .settings(name := "otros")
  .settings(
    Test / scalaSource  := baseDirectory.value / "otros/test",
    Compile / scalaSource  := baseDirectory.value / "otros/src"
  )

lazy val multiModule = (project in file("."))
  .aggregate(servipagos, otros)
  .settings(name := "sbt-multi-module")
  .settings(baseSettings)
