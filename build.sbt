name := "sbt-elastic-apm"
organization := "com.shadiramadan.sbt"
version := "1.0.0"

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/shadiramadan/sbt-elastic-apm"))

credentials += Credentials(Path.userHome / ".bintray" / ".credentials")

enablePlugins(SbtPlugin)

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.20" % "provided")

bintrayPackageLabels := Seq("sbt", "plugin")

bintrayVcsUrl := Some("https://github.com/shadiramadan/sbt-elastic-apm")

bintrayReleaseOnPublish := false
