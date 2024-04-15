lazy val baseSettings = Seq(
    scalaVersion := "2.12.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

lazy val servipagos = (project in file("servipagos"))
  .settings(baseSettings)
  .settings(name := "servipagos")
  .settings(
     test := { baseDirectory.value / "servipagos/tests" },
     compile := { baseDirectory.value / "servipagos/src" }
  )


lazy val otros = (project in file("otros"))
  .settings(baseSettings)
  .settings(name := "otros")
  .settings(
     test := { baseDirectory.value / "otros/tests" },
     compile := { baseDirectory.value / "otros/src" }
  )


lazy val multiModule = (project in file("."))
  .aggregate(servipagos, otros)
  .settings(name := "sbt-multi-module")
  .settings(baseSettings)
