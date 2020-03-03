
object minasVectores {

  def main(args: Array[String]): Unit = {
    var horasTem = llenarArreglo()

    for (i <- 0 until horasTem.length) {
      println("posicion " + i + " => " + horasTem(i))
    }
    println("*************************************")
    var horas = temperaturas(horasTem)

    for (i <- 0 until horas.length) {
      println("hora " + horas(i) + " temperatura => " + horas(i))
    }

  } //main

  def temperaturas(horasTem: Array[Int]): Array[Int] = {
    var cont = 0
    var pos = 0
    var hora = 0
    for (i <- 0 until horasTem.length) {
      if (horasTem(i) == 25) {
        cont += 2
      }
    }

    var temperaturas = new Array[Int](cont)
    for (i <- 0 until horasTem.length) {

      if (horasTem(i) == 25) {
        temperaturas(pos) = horasTem((i - 1))
        pos += 2
      }

    }

    for (i <- 0 until temperaturas.length) {

      if (hora % 2 == 0) {

      } else {
        temperaturas(i) = 25
      }
      hora += 1
    }

    temperaturas
  }
  //llenar arreglo
  def llenarArreglo(): Array[Int] = {
    var horasTem = new Array[Int](48)
    var hora = 0
    var cont = 0
    val r = new scala.util.Random

    for (i <- 0 until horasTem.length) {

      if (hora % 2 == 0) {
        horasTem(i) = cont
        cont += 1
      } else {
        horasTem(i) = r.nextInt(50)
      }
      hora += 1
    }
    horasTem

  } //llenar Arreglo

}//object