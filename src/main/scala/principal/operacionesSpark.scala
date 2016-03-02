package principal

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.util.collection.CompactBuffer
import scala.collection.immutable.SortedMap
import org.apache.commons.beanutils.converters.StringConverter
import org.apache.spark.sql.catalyst.expressions.Ascending
import org.apache.log4j.Logger
import org.apache.log4j.Level

object operacionesSpark {
  def main(arg: Array[String]) {
    Logger.getLogger("org").setLevel(Level.OFF)
    val sparkConf = new SparkConf().setAppName("jobName").setMaster("local")
    val sc = new SparkContext(sparkConf)

    println("Contenido del RDD mirdd")
    val mirdd1 = sc.textFile("/home/ibonmoleres/Escritorio/tabla1.txt")
    mirdd1.collect.foreach(println)

    println("\nContenido del RDD mirdd2")
    val mirdd2 = Map(("clave1", "valor1"), ("clave2", "valor2"), ("clave3", "valor3"))
    println("Keys de mirdd2 : " + mirdd2.keys)
    println("Values de mi rdd2 : " + mirdd2.values)
    //println("Values de mi rdd2 : " + mirdd2.)

    println("\nContenido del RDD mirdd3")
    val mirdd3 = Map((10, 12), (11, 21), (31, 32), (43, 47))
    println("pruebas : ")
    println("Keys de mirdd3 : " + mirdd3.keys)
    println("Values de mi rdd3 : " + mirdd3.values)

    println("\n++++++++++++++++++++++++++FLATMAP++++++++++++++++++++++++++")
    println("Contenido de mirdd1 con flatMap : ")
    val aux1 = mirdd1.map(line => line.split(",")).flatMap(x => x)
    aux1.collect.foreach(println)

    println("\n++++++++++++++++++++++++++GROUPBY++++++++++++++++++++++++++")
    val mirddint2 = List((11, 12), (11, 21), (31, 32))

    //val aux3 = mirddint2.groupBy((x,y)=>x)
    //val aux4 = mirddint2.groupBy(x=>(x._1 + 1, x._2))
    // println("Conetenido despues de groupBy : " + aux3)  

    println("\n++++++++++++++++++++++++++SORTBY++++++++++++++++++++++++++")
    println("Contenido de mirdd1 con sortBy: ")
    val aux3 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).sortBy(x => x)
    aux3.collect.foreach(println)

    println("\n++++++++++++++++++++++++++FILTER++++++++++++++++++++++++++")
    println("Contenido de mirdd1 con FILTER: ")
    val aux4 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).filter(line => line._1.startsWith("id1"))
    aux4.collect.foreach(println)

    println("\n++++++++++++++++++++++++++FLATMAPVALUES++++++++++++++++++++++++++")
    val aux5 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).flatMapValues(x => x)
    aux5.collect.foreach(println)

    println("\n++++++++++++++++++++++++++MAPVALUES++++++++++++++++++++++++++")
    println("Ordenacion del contenido mapValues ")
    val aux6 = mirdd3.mapValues(x => (x, 1))
    println(aux6)

    println("\n++++++++++++++++++++++++++SORTBYKEY++++++++++++++++++++++++++")
    println("Ordenacion del contenido sortByKey ")
    val aux7 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).sortByKey()
    aux7.collect.foreach(println)

    println("\n++++++++++++++++++++++++++GROUPBYKEY++++++++++++++++++++++++++")
    println("Contenido de mirdd1 con groupByKey : ")
    val aux8 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).groupByKey()
    aux8.collect.foreach(println)
    aux8.collect.foreach(line => line.productIterator.foreach(println))

    println("\n++++++++++++++++++++++++++REDUCEBYKEY++++++++++++++++++++++++++")
    println("Contenido de mirdd1 con reduceByKey")
    val aux9 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).reduceByKey((x, y) => x + y)
    aux9.collect.foreach(println)

    println("\n++++++++++++++++++++++++++COUNTBYKEY++++++++++++++++++++++++++")
    println("Contenido de mirdd1 con countByKey : ")
    val aux10 = mirdd1.map(line => line.split(",")).map(x => (x(0), x(1))).countByKey()
    println(aux10)

    println("\n++++++++++++++++++++++++++DATAFRAME++++++++++++++++++++++++++")

  }
}