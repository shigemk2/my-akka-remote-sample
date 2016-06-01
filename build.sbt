name := """my-akka-remote-sample"""

version := "1.0"

scalaVersion := "2.11.8"

// Uncomment to use Akka
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.6",
  "com.typesafe.akka" %% "akka-remote" % "2.3.6",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

enablePlugins(JavaAppPackaging)
maintainer in Docker := "shigemk2"
dockerBaseImage in Docker := "dockerfile/java"
