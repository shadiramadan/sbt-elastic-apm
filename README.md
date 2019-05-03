# sbt-elastic-apm

[![Download](https://api.bintray.com/packages/shadiramadan/sbt-plugins/sbt-elastic-apm/images/download.svg)](https://bintray.com/shadiramadan/sbt-plugins/sbt-elastic-apm/_latestVersion)

Add the Elastic APM Java Agent to your sbt project.

This project is heavily inspired by the [sbt-datadog](https://github.com/Colisweb/sbt-datadog) project.

Given the similar nature of the projects this plugin was quick to setup.  Merci [@guizmaii](https://github.com/guizmaii)!

Prerequisites
-------------
The plugin assumes that sbt-native-packager has been included in your SBT build configuration.
This can be done by adding the plugin following instructions at http://www.scala-sbt.org/sbt-native-packager/ or by adding
another plugin that includes and initializes it.

Installation
------------

Add the following to your `project/plugins.sbt` file:

```scala
resolvers += Resolver.bintrayIvyRepo("shadiramadan", "sbt-plugins")

addSbtPlugin("com.shadiramadan.sbt" % "sbt-elastic-apm" % "1.0.0")
```

To enable the Elastic APM for your project, add the `ElasticApmPlugin` auto-plugin to your project.

```scala
enablePlugins(ElasticApmPlugin)
```

Configuration
-------------

#### `elasticApmVersion`

To use a specific Elastic APM Java Agent version, add the following to your `build.sbt` file:

```scala
elasticApmVersion := "1.6.1"
```

#### `elasticApmServiceName`

By default, the agent will use the sbt project `name` value as `elastic.apm.service_name`.

To use another value, add the following to your `build.sbt` file:

```scala
elasticApmServiceName := "another name"
```

#### `elasticApmAgentApplicationPackages`

By default, the agent `elastic.apm.application_packages` value is `com.example`.

To use another value, add the following to your `build.sbt` file:

```scala
elasticApmAgentApplicationPackages := Seq("com.example")
```

#### `elasticApmAgentServerUrls`

By default, the agent `elastic.apm.server_urls` value is `http://localhost:8200`.

To use another value, add the following to your `build.sbt` file:

```scala
elasticApmAgentServerUrls := Seq(url("http://localhost:8200"))
```

