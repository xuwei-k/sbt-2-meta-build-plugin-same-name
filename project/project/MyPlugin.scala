package example

import sbt._

object MyPlugin extends AutoPlugin {
  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[?]] = Seq(
    TaskKey[Unit]("foo") := println("foo")
  )
}
