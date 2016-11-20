package com.spotifyadvisor

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import Router
import com.typesafe.config.ConfigFactory

object Main {
  def main(args: Array[String]): Unit = {
    val conf = ConfigFactory.load()

    implicit val system = ActorSystem("user")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher
    val bindingFuture = Http().bindAndHandle(Router.route, "0.0.0.0", 80)

  }
}
