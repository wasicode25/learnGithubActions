lazy val baseSettings = Seq(
    scalaVersion := "2.12.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test",
    Test /scalaSource  := baseDirectory.value / "/tests",
    Compile / scalaSource  := baseDirectory.value / "/src" 
)

lazy val servipagos = (project in file("servipagos"))
  .settings(baseSettings)
  /*.settings(name := "servipagos",
        Test /scalaSource  := baseDirectory.value / "/tests",
        Compile / scalaSource  := baseDirectory.value / "/src" 
  )*/


lazy val otros = (project in file("otros"))
  .settings(baseSettings)
  .settings(name := "otros")
 /* .settings(name := "servipagos",
        Test /scalaSource  := baseDirectory.value / "/tests",
        Compile / scalaSource  := baseDirectory.value / "/src" 
  )*/


lazy val multiModule = (project in file("."))
  .aggregate(servipagos, otros)
  .settings(name := "sbt-multi-module")
  .settings(baseSettings)
