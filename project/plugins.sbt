libraryDependencies += "org.scala-sbt" % "scripted-plugin_2.12" % sbtVersion.value
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.7")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")