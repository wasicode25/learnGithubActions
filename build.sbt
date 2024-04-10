lazy val baseSettings = Seq(
    scalaVersion := "2.12.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"


)

lazy val servipagos = (project in file("servipagos"))
  .settings(baseSettings)
  .settings(name := "servipagos")


lazy val multiModule = (project in file("."))
  .aggregate(servipagos)
  .settings(name := "sbt-multi-module")
  .settings(baseSettings)