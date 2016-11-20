package com.spotifyadvisor

import akka.http.scaladsl.server.Directives._

object Router {
  val route = {
    path("user") {
      post {
        complete("Hello")
      }
    } ~ path("some") {
      get {
        complete("Hello2")
      }
    }
  }
}
