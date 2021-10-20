object Main extends App {
//Ejercicio leccion 5

//Solucion Mariale
  def discount(n: Double) = {
    if (n < 50) {
      n
    } else if (n >= 50 && n < 100) {
      n * 0.9
    } else {
      n * 0.85
    }
  }

  //Solucion Priss
  def descuento(n: Int) = {
    if (n < 50) println("NO hay descuento")
    else if (n >= 50 || n < 100) { n * 0.9 }
    else { n * 0.85 }
  }

  /* println("El precio es: " + discount(30))
  println("El precio es: " + discount(80))
  println("El precio es: " + discount(130))

  println("El precio es: " + descuento(30))
  println("El precio es: " + descuento(80))
  println("El precio es: " + descuento(130)) */

  //Ejercicio leccion  6
  //Solucion Mariale
  def powFunc(exponent: Int, base: Int = 2): Int = {
    var res = 1
    for (i <- 1 to exponent) {
      println(res)
      res *= base
    }
    println("El resultado con pow es: " + scala.math.pow(base,exponent))
    res
  }
  println("El resultado con mi funcion es: " + powFunc(2,3))

}
