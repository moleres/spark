package spark

class flatmap {
  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
  println("Keys in colors : " + colors.keys)
  println("Values in colors : " + colors.values)

  val aux = colors.flatMap(x => x + "A")
  println("Resultado de FlatMap" + aux.toString())

}