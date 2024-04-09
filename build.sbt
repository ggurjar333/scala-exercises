ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.0"

lazy val root = (project in file("."))
  .settings(
    name := "example-excel-scala"
  )

libraryDependencies ++= Seq(
  "org.apache.poi" % "poi-ooxml" % "5.2.0",
  "org.apache.spark" %% "spark-core" % "3.2.0",
  "com.crealytics" %% "spark-excel" % "0.14.0"
)
