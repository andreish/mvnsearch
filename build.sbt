lazy val root = (project in file(".")).
  enablePlugins(ConscriptPlugin).settings(
      name := "mvnsearch",
      organization := "com.github.tototoshi",
      version := "0.3.1",
      scalaVersion := "2.11.8",
      resolvers += "sonatype-public" at "https://oss.sonatype.org/content/groups/public",
      resolvers <+= sbtResolver,
      scalacOptions ++= Seq("-feature"),
      libraryDependencies ++= Seq(
        "com.github.scopt" %% "scopt" % "3.4.0",
        "org.scalatest" %% "scalatest" % "2.2.5" % "test",
        "org.json4s" %% "json4s-jackson" % "3.3.0"
      )
  )

