package scala

class operacionesMaps {
  //  Keys are unique in the Map, but values need not be unique.
  val mimap = Map("mykey" -> "myval", "myotherkey" -> "otherval", "nextkey" -> "nextval")

  def añadirElemento(x: String) {
    println("En la funcion añadirElemento : "+ mimap.+("nextkey" -> "nextval"))   
    imprimir
  }

  def borrarElemento(x: String) {
    println("En la funcion borrarElemento : "+ mimap.-("nextkey"))
    imprimir
  }

  def buscar(x: String) {
    println("En la funcion buscar : " + mimap.contains("mykey"))
  }

  def imprimir {
    println("Valor asociado a una key  : " + mimap)
    println(mimap("mykey"))
  }

  def demapaarray {
    println("En la funcion desetaarray :  " + mimap.toArray)   
    for (x <- mimap.toArray) {
      println(x)
    }
  }

  def demapaset() {
    println("En la funcion demapaset ")
    print(mimap.toSet)
  }

  def demapalist() {
    println("En la funcion demapalist ")
    println(mimap.toList)
  }
}