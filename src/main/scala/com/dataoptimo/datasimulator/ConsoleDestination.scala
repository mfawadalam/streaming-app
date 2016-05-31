package com.dataoptimo.datasimulator

//import com.dataoptimo.datasimulator.Destination




class ConsoleDestination extends Destination {
  
  def consume(key: String, value: String){
    println(key,value)
    
  }

}