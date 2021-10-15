object Main extends App {
  println("Hello, Mariale!")
  //Primer ejercicio
  def signo(x: Int) = {
    if (x == 0) 0
    else if (x < 0) -1
    else 1
  }
  signo(7)

//Segundo ejercicio
//Es un tipo Unit.
  /*Unit es un subtipo de scala.AnyVal. Solo hay un valor de tipo Unidad, (), y no está representado por ningún objeto en el sistema de tiempo de ejecución subyacente. Un método con el tipo de retorno Unit es análogo a un método Java que se declara nulo.*/

//Tercer ejercicio
  var x = () //> res: x = Unit ()
  var y = 0 //> res: y = 0
  x = y = 1

//Cuarto ejercicio
  for (i <- 10 to 0 by -1)
    println(i)

//Quinto ejercicio
  def countdown(x: Int) = {
    for (i <- x to 0 by -1)
      println(i)
  }
  countdown(8)
//Sexto ejercicio
  def wordProduct(x: String) = { //x es el valor a calcular
    var i =
      1 // se declara la variable i para iterar y obtener producto al final
    for (a <- x)
      i *= a.toInt // bulce for que recorre el string y luego multiplica con la variable i
    println(x, i) // valor de i = Producto
  }
  wordProduct("hola")
//Septimo ejercicio
//el .map permite hacer una conversion implicita de _(tipo string) a entero y luego mutiplicarlo
  val St = "Hello".map(_.toInt).product; println(St)
//Octavo ejercicio
  def product(s: String) = {
    println(s.map(_.toInt).product)
  }
  product("Hello")

  / Noveno ejercicio --> recursivo
  def prodR(s: String): Int = {
    if (s.length() == 1)
      s.head.toInt /*el if evalua la longitud de la cadena, igual a 1 ENTONCES la variable usa el metodo head(devuelve el primer elemento de la lista) y lo convierte en entero*/
    else
      s.head.toInt * prodR(
        s.drop(1)
      ) /* de estar convertido, continua con el siguiente*/
  }
  prodR("hola")
  //Decimo ejercicio
  def recursivaXN(x: Int, n: Int): Double = {
    if (n == 0) 1.toDouble
    else { //Condicion x ^ 0 = 1
      if (n < 0) 1 / recursivaXN(x, -n)
      else { //Condicion n es negativo --> x^n = 1/x ^ - n (la recursiva se usa para colocar la x y valor de n
        if (n % 2 == 0) { //
          val y = recursivaXN(x, n / 2);
          y * y //Condicion x ^ n = y^2 (n > 0) donde y = x ^ (n/2)
        } else {
          x * recursivaXN(x, n - 1) //Condicion x ^ n = (x * x) ^ n -1
        }
      }
    }
  }
  println(recursivaXN(5, -6) + "")
}
