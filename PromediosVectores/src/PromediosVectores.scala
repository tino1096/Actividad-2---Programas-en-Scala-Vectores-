import scala.io.StdIn._

import scala.collection.mutable.ArrayBuffer



object PromediosVectores {
  
  def main(args: Array[String]): Unit = {
    var calificaciones = Array.ofDim [Double] (4, 6) 
    //var calificaciones = new Array[Array [Double]](4)(6)
   var x=0
    
    
    for(i <- 0 until calificaciones.length){
      println("Ingresa la calificacion  del parcial "+(i+1)+":")
      
    
    for(k <- 0 until 6){
      println("Ingresa la calificacion "+(k+1)+":")
       calificaciones(i)(k) = readDouble()
      
    }
      
     
    }
    
    
    
    for(i <- 0 until promedioParcial(calificaciones).length){
     println("El promedio del parcial " +(i+1) + " es: "+promedioParcial(calificaciones)(i))
    }
    println("********************************************************************************")
    
    for(i <- 0 until promedioMateria(calificaciones).length){
      println("El promedio de la materia " +(i+1) + " es: "+promedioMateria(calificaciones)(i))
    }
    
   println("********************************************************************************")
    
    
    println("El promedio general es: " + promedioGeneral(calificaciones))
    
  
    
  }//main
  
   //Funcion promedio parcial
  def promedioParcial(calificaciones : Array[Array [Double]]) : Array[Double] ={
    val proParcial = new Array[Double](4)
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      for(j <- 0 until calificaciones.length){//until tiene limite de n-1
        proParcial(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      proParcial(i) = proParcial(i)/proParcial.length
      
    }
    return proParcial
  }//promedio Parcial
  
   //Funcion promedio materia
  def promedioMateria(calificaciones : Array[Array [Double]]) : Array[Double] ={
    var promMateria = new Array[Double](6)
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      for(j <- 0 until calificaciones.length){//until tiene limite de n-1
        promMateria(j) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      promMateria(i) = promMateria(i)/promMateria.length
      
    }
    return promMateria
  }// promedio Materia
  
  
  //Funcion promedio general
  def promedioGeneral(calificaciones : Array[Array [Double]]) : Double ={
    var promGeneral = new Array[Double](4)
    var pg = 0.0
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      for(j <- 0 until calificaciones.length){//until tiene limite de n-1
        promGeneral(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until promGeneral.length){//until tiene limite de n-1
      pg += promGeneral(i)
      
    }
    return pg /(promGeneral.length * promGeneral.length)
  }//promedio General
  
  
}//object