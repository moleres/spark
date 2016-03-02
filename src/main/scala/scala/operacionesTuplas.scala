package scala

class operacionesTuplas {
  val mitupla2 = new Tuple2(("Scala", "hello"), ("segundo", "adios"))
  val mitupla3 = new Tuple3(1, "hello", Console)

  
  def imprimir {
    println("\nContenido de elementos de la tupla t2 : " + mitupla2._1._1 + " " + mitupla2._2._2)
    println("Contenido de los elementos de la tupla t2 : " + mitupla2)
    println("Contenido utilizando productiterator")
    mitupla3.productIterator.foreach(println)
  }

  def tuplatostring {
    mitupla2.toString()
  }

}