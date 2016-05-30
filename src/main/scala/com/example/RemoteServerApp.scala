package com.example

import java.io.File

import akka.actor.{ActorLogging, Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object RemoteServerApp extends App {
  val configFile = getClass.getClassLoader.getResource("server.conf").getFile
  val config = ConfigFactory.parseFile(new File(configFile))
  val system = ActorSystem("remote-system", config)
  val remote = system.actorOf(Props[RemoteActor], name="remote")
  system.log.info("Remote is ready")
}

class RemoteActor extends Actor with ActorLogging {
  override def receive: Receive = {
    case msg: String =>
      log.info("Remote received {} from {}", msg, sender)
      sender ! msg
    case any =>
      log.info("Remote received unknown message {} from {}", any, sender)
  }
}