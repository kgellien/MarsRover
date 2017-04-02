name := "MarsRover"

organization := "de.gellien"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.9"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  Seq(
    "org.specs2" %% "specs2-core" % "3.8.9" % "test"
  )
}

scalacOptions in Test ++= Seq("-Yrangepos")
