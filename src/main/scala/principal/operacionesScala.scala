package principal

object operacionesScala {
  def main(arg: Array[String]) {
 
  println("+++++++++++++++++OPERACIONES CON ARRAYS+++++++++++++++++")
    println("\nDefinir")
    val miarray = new operacionesArray()

    println("\nAñadir un elemento")
    val posicion = 1
    val x = 23
    miarray.añadirElemento(x, posicion)

    println("\nBorrar un elemento")
    miarray.borrarElemento(posicion)

    println("\nImprimir")
    miarray.imprimir

    println("\nTRANSFORMACIONES")
    println("De Array a List ")
    miarray.dearrayalist()

    println("\nDe Array a Map ")
    miarray.dearrayamap()

    println("\nDe Array a Set ")
    miarray.dearrayaset()

    println("\n+++++++++++++++++OPERACIONES CON LISTAS+++++++++++++++++")
    println("\nDefinir")
    val milista = new operacionesListas()
    
    println("\nAñadir un elemento")
    var z= "nuevo"
    
    milista.añadirElemento(z,posicion)
 
    println("\nBorrar un elemento")
    milista.borrarElemento(z)

    println("\nBuscar un elemento")
    val elem = "oranges"
    milista.buscar(elem)

    println("\nImprimir")
    milista.imprimir

    println("\nTRANSFORMACIONES")
    println("De List a Array ")
    milista.delistaaarray()

    println("\nDe List a Map ")
    milista.delistaamap()

    println("\nDe List a Set ")
    milista.delistaaset()

    println("\n+++++++++++++++++OPERACIONES CON CONJUNTOS+++++++++++++++++")
    val miconjunto = new operacionesConjuntos()

    println("\nAñadir un elemento")
    val elem2="Nuevo2"
    miconjunto.añadirElemento(elem2)

    println("\nBorrar un elemento")
    miconjunto.borrarElemento(elem2)

    println("\nBuscar un elemento")    
    miconjunto.buscar(elem2)

    println("\nImprimir")
    miconjunto.imprimir()

    println("\nTRANSFORMACIONES")
    println("De Set a Array")
    miconjunto.desetaarray()

    println("\nDe Set a Map")
    miconjunto.desetamap()

    println("\nDe Set a Set")
    miconjunto.desetalist()

    println("\n+++++++++++++++++OPERACIONES CON MAPS+++++++++++++++++")
    println("\nDefinir")
    val mimap = new operacionesMaps()

    println("\nAñadir un elemento")
    val elem4="nuevo"
    mimap.añadirElemento(elem4)

    println("\nBorrar un elemento")
    mimap.borrarElemento(elem4)

    println("\nBuscar un elemento")    
    mimap.buscar(elem4)

    println("\nImprimir")
    mimap.imprimir

    println("\nTRANSFORMACIONES")
    println("De Map a Array ")
    mimap.demapaarray

    println("\nDe Map a Set ")
    mimap.demapaset

    println("\nDe Map a List ")
    mimap.demapalist
    
    println("\n+++++++++++++++++OPERACIONES CON TUPLAS+++++++++++++++++")
    println("\nDefinir")
    val mitupla= new operacionesTuplas()    
    
    println("\nImprimir una tupla")
    mitupla.imprimir
    
    println("\nTRANSFORACIONES")
    println("De Tuple a String")
    mitupla.tuplatostring       
    
    println("\n+++++++++++++++++FIN+++++++++++++++++")
  }
}