name := "MarsRover"

organization := "de.gellien"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.9"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val specs2Version = "3.8.9"
  Seq(
      "org.specs2" %% "specs2-core" % specs2Version % "test"
    , "org.specs2" %% "specs2-junit" % specs2Version % "test"
  )
}

scalacOptions in Test ++= Seq("-Yrangepos")
