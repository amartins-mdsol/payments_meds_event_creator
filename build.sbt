name := "payments_meds_event_creator"

version := "0.1"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.16"

//libraryDependencies += "com.typesafe.akka" %% "akka-quartz-scheduler_$scala_version" % "1.6.1-akka-2.3.x"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.6.1-akka-2.5.x"
)

cancelable in Global := true
