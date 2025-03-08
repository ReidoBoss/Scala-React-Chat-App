name         := """scala-react-chat-app"""
organization := "com.reidoboss"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "3.3.4"

lazy val pekkoVersion = "1.2.0-M1"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play"          % "7.0.1" % Test,
  "org.apache.pekko"       %% "pekko-cluster-typed"         % pekkoVersion,
  "org.apache.pekko"       %% "pekko-serialization-jackson" % pekkoVersion
)

/**
 * we will use this for development only but we've also already setup this on
 * the application.conf because it will be needed in production
 */
PlayKeys.devSettings ++= Seq(
  "play.server.websocket.periodic-keep-alive-max-idle" -> "10 seconds",
  "play.server.websocket.periodic-keep-alive-mode"     -> "pong"
)
