package sparkstreaming

import org.apache.spark._
import org.apache.spark.streaming._
import org.apache.spark.streaming.StreamingContext._
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.util.collection.CompactBuffer
import scala.collection.immutable.SortedMap
import org.apache.commons.beanutils.converters.StringConverter
import org.apache.spark.sql.catalyst.expressions.Ascending
import org.apache.log4j.Logger
import org.apache.log4j.Level

object ejemplostreaming {
  def main(arg: Array[String]) {

    Logger.getLogger("org").setLevel(Level.OFF)
    val sparkConf = new SparkConf().setAppName("jobName").setMaster("local")
    val sc = new SparkContext(sparkConf)
    println("Paso 1")
    val ssc = new StreamingContext(sc, Seconds(2))
    println("Paso 2")
    val lines = ssc.socketTextStream("localhost", 9999)
    println("Paso 3")
    val words = lines.flatMap(_.split(" "))
    println("Paso 4")
    val pairs = words.map(word => (word, 1))
    println("Paso 5")
    val wordCounts = pairs.reduceByKey(_ + _)
    println("Paso 6")
    wordCounts.print()
    println("Paso 7")
    ssc.start()
    println("Paso 8")
    ssc.awaitTermination()
    println("FIN")

  }
}