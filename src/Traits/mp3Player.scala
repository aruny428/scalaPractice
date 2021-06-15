package Traits

class mp3Player extends BaseSoundPlayer {

  override def play: Unit = {println("playing sound")}

  override def close: Unit = {}

  override def stop: Unit = {}

  override def pause: Unit = {}

  override def resume: Unit = {}

  demoVar = 20
}
