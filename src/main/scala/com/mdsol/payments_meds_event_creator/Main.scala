package com.mdsol.payments_meds_event_creator

import akka.actor.{ActorRef, ActorSystem, Props}
import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val doStuffActor:ActorRef = system.actorOf(Props[DoStuffOnSchedulerActor], name = "helloactor")

  case object Tick
  val scheduler = QuartzSchedulerExtension(system)

  QuartzSchedulerExtension(system).schedule("Every30Seconds", doStuffActor, Tick)
}
