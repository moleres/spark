package sparksql

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.util.collection.CompactBuffer
import scala.collection.immutable.SortedMap
import org.apache.commons.beanutils.converters.StringConverter
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types.StructType
import org.apache.spark.SparkContext
import org.apache.spark.sql._
import org.apache.spark.sql.types.{ StructType, StructField, StringType, IntegerType }
import org.apache.spark.sql.types.LongType
import org.apache.spark.sql.types.BooleanType
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.IntegralType
import org.apache.log4j.Logger
import org.apache.log4j.Level

object ejemplosparksql {
  def main(arg: Array[String]) {

    Logger.getLogger("org").setLevel(Level.OFF)
    val sparkConf = new SparkConf().setAppName("jobName").setMaster("local")
    val sc = new SparkContext(sparkConf)
    val sqlContext = new SQLContext(sc)

    val fields = StructType(List(StructField("id", StringType, false),
      StructField("tablacampo1", StringType, false),
      StructField("tablacampo2", StringType, false)))

    val df = sqlContext.load("/home/ibonmoleres/Escritorio/tabla2.csv")
        //.format("com.databricks.spark.csv")
      //.option("header", "false") // Use first line of all files as header
      //.option("inferSchema", "true") // Automatically infer data types
      //.schema(fields)
      //.load("/home/ibonmoleres/Escritorio/tabla1.txt")
    df.show()
  }
}