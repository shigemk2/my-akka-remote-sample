package com.example

import akka.actor.{ActorSystem}
import com.typesafe.config.ConfigFactory

/**
  * Akka-Remoteを用いて接続し、メッセージを送信するクラス
  */
object RemoteClientApp extends App {
  override def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load("client.conf")
    val system = ActorSystem.apply("RemoteClientApp", config)
    val remoteActorRef = system.actorSelection("akka.tcp://RemoteServerApp@127.0.0.1:2552/com/example/Receive")
    remoteActorRef ! "Remote"

    Thread.sleep(600000)
    system.shutdown()
  }
}