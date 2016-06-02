package com.dataoptimo.datasimulator

import com.dataoptimo.datasimulator.ConsumptionProfile._
//import com.dataoptimo.datasimulator.Destination
import java.lang.System
import java.util.Calendar
import java.util.GregorianCalendar



class EnergySimulator(property: ConsumptionProfile.Property, time: ConsumptionProfile.Time, destination: Destination)
	extends Simulator(destination){
	
	
	val uuid = java.util.UUID.randomUUID().toString()
	
	def start(){
	 
	  if (property == House && time == Minute){
	     while (true){
		 val currentMinute = minute
	     val weight = HouseProfile.profile.get(currentMinute).get
	     destination.consume(uuid,simulate(1300,weight).toString)
	     }
	     
	  }
	  
	  
	}
	
	def simulate(avgConsumption: Double, weight: Double): Double={
	  avgConsumption*weight*(0.9 + (Math.random()* 0.2))
	  
	}
	
	 def minute: Int = {
	  val date = new GregorianCalendar()
	  date.set(Calendar.HOUR_OF_DAY, 0)
	  date.set(Calendar.MINUTE, 0)
	  date.set(Calendar.SECOND, 0)
	  date.set(Calendar.MILLISECOND, 0) 
	  val difference = System.currentTimeMillis()-date.getTimeInMillis()
	  Math.ceil(difference/1000/60).toInt
	  
	}
	
	
	 
}