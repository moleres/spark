package scala

class operacionesArray {
  var auxArray = Array(1.9, 2.9, 3.4, 3.5)
  var auxArrayMutable = scala.collection.mutable.ArrayBuffer.empty[Int]
  auxArrayMutable += 1 
  auxArrayMutable += 2
  auxArrayMutable += 3
 
  def añadirElemento(elem: Int, posicion: Int) {
    auxArray(posicion) = elem 
    println("En la funcion añadirElemento" )
    imprimir
    auxArrayMutable += 10
    imprimirmutable
  }

  def borrarElemento(posicion: Int) {
    println("En la funcion borrarElemento ")
    auxArray(posicion) = 0
    imprimir        
    auxArrayMutable -= 10
    imprimirmutable
  }  
  
  def imprimir {
    for (x <- auxArray) {
      println(x)
    }
  }
  def imprimirmutable{
    println("\nEn la funcion imprimirmutable" )
    for (x <- auxArrayMutable) {
      println(x)
    }
  }
  def dearrayalist(){
    println("En la funcion dearrayalist ")
    println(auxArray.toList.find(x => x==1.9).isDefined)
    auxArray.toList.foreach(println)
  }
  
  def dearrayamap(){
    println("En la funcion dearraymap ")
    var map = auxArray.map(x => (x, 1)).toMap
    println(auxArray.map(x => (x, 1)).toMap)
    println(map(1.9))
  }
  
  def dearrayaset(){
    println("En la funcion dearrayalist ")
    println(auxArray.toSet.contains(1.9))
  }
   
}