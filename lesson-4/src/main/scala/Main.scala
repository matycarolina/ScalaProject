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
    else if (n >= 50 && n < 100) { n * 0.9 }
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

//ejercicio No. 6
def power(base: Int, exponent: Int) = {
    var ans = 1;
    if (exponent != 0) {
        var int absExponent = exponent > 0 else exponent = (-1) * exponent;
        for (i <- absExponent; _ <- i+=) {
            ans *= base;
        }
      }
        if (exponent < 0) {
            // For negative exponent, must invert
            ans = 1 / ans;
    } else {
        // exponent is 0
        ans = 1;
    }
  ans;
}

//ejercicio de clases
class Person (name: String, age: Int = 0) {
  def presentYourself = {
    f"Hello I'm $name and I have $age years old"
  }
}

//Instancias para ejecutar la clase Person
val martin = new Person("Martin", 18)
val bob = new Person("Bob")

//ejercicio de subclase
class profesor extends Person(name: String, age: Int){
  override def presentYourself = {
    f"Hello I'm the professor $name and I have $age years old"
  }
}

class estudiante extends Person(name: String, age: Int, id: int){
  override def presentYourself: String = {
    f"Hello I'm the student $name, with de $id and I have $age years old"
  }
}