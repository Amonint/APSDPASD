val goleadores = List(     ("Oscar Becerra" , 17),
    ("Luis Amarallia" , 16),
    (" Michael Estrada", 16),
    ("Fidel Martínez", 16), 
    ("Gonzalo Mastriani", 13),
    ("Leonel Vides" , 13),
    ("Rodrigo Aguirre", 12),
    ("Carlos Garces" , 12),
    ("Jonathan Borja" , 11))

val Promedio : (List[String], List[Int])= goleadores.unzip
    val numeros =(Promedio._2).sum/(Promedio._2).size

def mgol (l:List[(String,Int)])=
    l.filter(k=>k._2 >16).map{case (n,gt) =>(n,gt)}

print(mgol(goleadores))


def megol (l:List[(String,Int)])=
    l.filter(k=>k._2 < 12).map{case (n,gt) =>(n,gt)}

print(megol(goleadores))

def promedioMI (l:List[(String,Int)])=
    l.filter(k=>k._2 >=14).map{case (n,gt) =>(n,gt)}

print(promedioMI(goleadores))

def promediomI (l:List[(String,Int)])=
    l.filter(k=>k._2 <=14).map{case (n,gt) =>(n,gt)}

print(promediomI(goleadores))


