val scala3Version = "3.3.0-RC6"

lazy val root = project
  .in(file("."))
  .settings(
    name         := "async",
    version      := "0.1.0-SNAPSHOT",
    organization := "tw",
    scalaVersion := scala3Version,
    javaOptions += "--enable-preview --version 19",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
