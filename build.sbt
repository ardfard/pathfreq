import Dependencies._

ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "pathfreq"
ThisBuild / organizationName := "pathfreq"

lazy val root = (project in file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    name := "pathfreq",
    libraryDependencies += scalaTest % Test,
    Compile / mainClass := Some("pathfreq.PathFreq"),
    nativeImageOptions ++= Seq("-H:EnableURLProtocols=https")
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
