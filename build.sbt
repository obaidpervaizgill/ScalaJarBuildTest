name := "ScalaJarBuildTest"

version := "1.0"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "junit" % "junit" % "4.10" % Test

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"