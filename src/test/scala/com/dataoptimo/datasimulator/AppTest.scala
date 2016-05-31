package com.dataoptimo.datasimulator

import org.junit._
import Assert._
//import com.dataoptimo.datasimulator.ConsoleDestination

@Test
class AppTest {

    @Test
    def testSimulatorMinute() = {
      val dst = new ConsoleDestination()
      val simulator = new Simulator(ConsumptionProfile.House, ConsumptionProfile.Minute,dst)
      println(simulator.minute)
      println(System.currentTimeMillis())
      assertTrue(simulator.minute==929)
      
          
    }

//    @Test
//    def testKO() = assertTrue(false)

}


