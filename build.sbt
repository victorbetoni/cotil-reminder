scalaVersion := "2.13.3"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
resolvers += Resolver.JCenterRepository
libraryDependencies += "net.katsstuff" %% "ackcord"                 % "0.17.1" //For high level API, includes all the other modules
libraryDependencies += "net.katsstuff" %% "ackcord-core"            % "0.17.1" //Low level core API
libraryDependencies += "net.katsstuff" %% "ackcord-commands"        % "0.17.1" //Low to mid level Commands API
libraryDependencies += "net.katsstuff" %% "ackcord-lavaplayer-core" % "0.17.1" //Low level lavaplayer API