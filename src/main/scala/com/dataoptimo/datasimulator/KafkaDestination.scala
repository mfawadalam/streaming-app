package com.dataoptimo.datasimulator

import java.util.Properties
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord

class KafkaDestination(host: String, topic: String) extends Destination{

  def consume(key: String, value: String)
  {
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    val producer = new KafkaProducer[String,String](props)
    val record = new ProducerRecord(topic,key,value)
    producer.send(record)
    
  }
  
  
}