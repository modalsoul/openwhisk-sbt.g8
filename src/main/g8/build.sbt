name := "$name;format="Camel"$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "com.google.code.gson" % "gson" % "2.8.0",
  "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
