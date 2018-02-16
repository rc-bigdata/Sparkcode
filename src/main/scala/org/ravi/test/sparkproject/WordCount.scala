package org.ravi.test.sparkproject

import org.apache.spark.SparkConf
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]")
                   .setAppName("Word Count")
    val sc = new SparkContext(conf)
    println("hello")
    
             
  }
}