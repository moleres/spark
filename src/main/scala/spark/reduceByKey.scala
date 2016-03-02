package spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.util.collection.CompactBuffer
import scala.collection.immutable.SortedMap
import org.apache.commons.beanutils.converters.StringConverter
import org.apache.spark.sql.catalyst.expressions.Ascending

object reduceByKey {
  def main(arg: Array[String]) {
    
    val sparkConf = new SparkConf().setAppName("jobName").setMaster("local")
    val sc = new SparkContext(sparkConf)
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)

    //Cargando fichero. El text se convierte en un array de strings. Map devuelve el mismo tipo que recibe.
    val callejero = sc.textFile("file:///home/ibonmoleres/Escritorio/CALLEJERO_VIGENTE_VIALES_201512.csv")
    val lines = callejero.map(line => line.split(';')).count()    
    println(lines)
  }
}