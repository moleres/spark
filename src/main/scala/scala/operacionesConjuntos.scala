package scala

class operacionesConjuntos {

  val miconjunto = Set("apples", "oranges", "pears")

  def añadirElemento(elem: String) {
    println("En la funcion añadirElemento : " + miconjunto.+(elem))        
  }

  def borrarElemento(elem: String) {
    println("En la funcion borrarElemento : " + miconjunto.-(elem))        
  }

  def buscar(elem: String) {
    println("En la funcion borrarElemento : " + miconjunto.contains(elem))
  }

  def imprimir() {
    println("Contenido del conjunto : " + miconjunto)
  }

  def desetaarray() {
    println("En la funcion desetaarray")
    var miArray = miconjunto.toArray
    for (x <- miArray) {
      println(x)
    }
  }

  def desetamap() {
    println("En la funcion desetamap")
    var map = miconjunto.map(x => (x, 1)).toMap
    println(map)
    println(map("oranges"))
  }

  def desetalist() {
    println("En la funcion desetalist")
    println(miconjunto.toList)
  }
}