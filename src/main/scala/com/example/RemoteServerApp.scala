package com.example

import java.io.File

import akka.actor.{ActorLogging, Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object RemoteServerApp extends App {
  println(getClass.getClassLoader.getResource("server.conf"))
  val configFile = getClass.getClassLoader.getResource("resources/server.conf").getFile
  println(getClass.getClassLoader.getResource("resources/client.conf").getFile)
  val config = ConfigFactory.parseFile(new File(configFile))
  val system = ActorSystem("remote-system", config)
  val remote = system.actorOf(Props[RemoteActor], name="remote")
  system.log.info("Remote is ready")
}

class RemoteActor extends Actor with ActorLogging {
  override def receive: Receive = {
    case msg: String =>
      log.info("Remote received {} from {}", msg, sender)
      sender ! "hi"
    case any =>
      log.info("Remote received unknown message {} from {}", any, sender)
  }
}