# A [Giter8][g8] template for creating Scala 3 Libraries!

## Instructions

This template creates a single `Scala` project designed for developing a library, packaged as a `jar` module. To create the new project from this template, do the following:

```shell
sbt new jmarinbynder/bynder-scala-library.g8
```

There will be a set of prompts for customizing your project with some default values that you can override. It is suggested to override the name of the project, which will drive the name of the package structure and the `jar` created by this project. You can leave the rest as default and just hit enter.

```shell
name [Awesome Bynder Scala Library]: sample
organization [com.bynder]:
package [com.bynder]: 
scalatest_version [3.2.13]:
scalacheck_version [1.16.0]:
```

This creates the complete scaffolding for a new `Scala` Library project. There is a minimum amount of sample code that you will override in your implementation, to test that everything worked correctly run the following from the new project's root directory:

```shell
sbt test
```

You should see the output from `ScalaTest` and / or `ScalaCheck`


[g8]: http://www.foundweekends.org/giter8/

## Developing

When developing this template, make sure the code generated has no issues (i.e. typos, compilation failures) by running:

```shell
sbt g8Test
```

This should run the scripted plugin and exit without errors
