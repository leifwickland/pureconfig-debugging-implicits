scalaVersion := "2.12.4"

libraryDependencies += "com.github.pureconfig" %% "pureconfig" % "0.8.0"

scalacOptions += "-Xmacro-settings:materialize-derivations"
