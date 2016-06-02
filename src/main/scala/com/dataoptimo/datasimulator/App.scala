package com.dataoptimo.datasimulator


/**
 * Hello world!
 *
 */
object App extends Application {
  
  val dst = new KafkaDestination("localhost:9042","topic1")
  val simulator = new EnergySimulator(ConsumptionProfile.House,ConsumptionProfile.Minute,dst)
  simulator.start()
  
}
