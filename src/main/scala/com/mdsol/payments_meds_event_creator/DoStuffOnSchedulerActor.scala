package com.mdsol.payments_meds_event_creator

import akka.actor.Actor

class DoStuffOnSchedulerActor extends Actor {
  def receive: PartialFunction[Any, Unit] = {
    case _ => println("reading MEDS and creating events.")
  }
}
