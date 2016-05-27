package com.example

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

class MessagePrintActor extends Actor {

  def receive = {
    case msg: String => {
      val message = self.path + ": Received String " + msg
      println(message)
    }
  }
}

/**
  * Akka-Remoteを用いて接続を受け付けるクラス
  */
object RemoteServerApp extends App {
  override def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load("remote.conf")
    val system = ActorSystem.apply("RemoteServerApp", config)
    val actor1 = system.actorOf(Props[MessagePrintActor], "Receive")

    actor1 ! "Local"

    Thread.sleep(600000)
    system.shutdown()
  }
}