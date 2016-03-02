package scala

class operacionesListas {
  val milista = "apples" :: ("oranges" :: ("pears" :: Nil))
  val milistamutable = scala.collection.mutable.ListBuffer.empty[Int]
  milistamutable+=2
  milistamutable+=3
  milistamutable+=4

  def añadirElemento(elem: String, pos: Int) {
    println("En la funcion añadirElemento ")
    milistamutable += 1
    println("Elemento añadido a la lista mutable : " + milistamutable)
    imprimirmutable    
  }

  def borrarElemento(elem: String) {
    println("En la funcion borrarElemento")  
    milistamutable -= 1
    println("Elemento borrado de la lista mutable : " + milistamutable)
    imprimirmutable       
  }

  def imprimir {
    milista.foreach { println }
  }
  
  def imprimirmutable {
    milistamutable.foreach { println }
  }
  
  def buscar(elem:String){
      println(milista.find(x => x==elem).isDefined)    
  }
  
  def delistaaarray(){
    var miArray=milista.toArray
    for (x <- miArray) {
      println(x)
    }
  }
  
  def delistaamap(){    
    var map=milista.map(x=>(x,1)).toMap
    println("\n Contenido del Map")
    println(map)
    println("\n El valor asociado a la key banana")
    println(map("apples"))
  }
    
  def delistaaset(){
    println(milista.toSet)     
  }
  
  
  
  
}