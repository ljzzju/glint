package ch.ethz.inf.da.glint

import akka.actor.Actor
import akka.actor.Actor.Receive

/**
 * A client interface that allows a worker node to communicate with spark workers
 */
class ParamClient extends Actor {

  override def receive: Receive = {
    case _ => println("Not yet implemented...")
  }

}
