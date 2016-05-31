package com.dataoptimo.datasimulator


/**
 * Hello world!
 *
 */
object App extends Application {
  
  val dst = new ConsoleDestination()
  val simulator = new Simulator(ConsumptionProfile.House,ConsumptionProfile.Minute,dst)
  simulator.start()
  
}
