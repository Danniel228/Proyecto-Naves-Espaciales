# Proyecto-Naves-Espaciales

EXPLICACIÓN PARA EL CODIGO:

VIDEO EN YOUTUBE CON LA EXPLICACIÓN DEL VIDEO: https://www.youtube.com/watch?v=pEMYh1IjK08&ab_channel=DanielCorrea

• Empezamos creando la clase principal que NavesEspaciales, en esta clase tendremos 3 atributos, nombre, país y actividad. Los tres son datos tipo protected ya que esta
  clase tendrá hijos.
• Creamos el constructor para cada uno de los atributos y le agregamos los métodos getters
• Luego se crean dos métodos, que todas las clases hijos van a usar, al ser una super clase en donde las subclases heredan los métodos, el método se tornara abstracto

PARA LAS CLASES HIJOS 

• Empezamos creando la clase Lanzaderas, como es una clase que hereda de la clase NavesEspaciales ponemos la palabra extends
• Agregamos los atributos propios de la clase que en este caso sería ejemplo, le agregamos su constructor y los métodos getter. En este caso serán de tipo 
  privados para encapsularlo 
• Dentro de esta clase debo implementar los métodos abstractos planteados en la clase principal y agregamos cual sería su papel en este tipo método, 
como por ejemplo viajar, las naves tipo lanzaderas viajan por propulsión. 
• Estas clases hijas deben ir con override ya que estamos sobrescribiendo los datos de la clase padre 
• Luego implementamos los métodos propios de la clase que en este caso es volarMarte. 
• De la misma manera como hicimos esta clase hija procedemos con las demás clases: Lanzaderas y Tripuladas, sobrescribiendo los métodos viajar y función como les 
corresponden y creando un método propio de la clase 
• De este modo quedamos con una clase padre y tres hijas.

CREAMOS LA CLASE PRINCIPAL O MAIN 

• Creamos un arreglo para almacenar todas las clases de naves 
• El Scanner nos sirve para guardar las opciones de menú, que a continuación se explicara 
• Luego creamos todos los objetos para los tipos de naves con los atributos correspondientes, ejemplo de naves, el nombre, país y actividad. Lo hacemos fuera del main
para usarlo en los diferentes métodos que voy a crear • Dentro del main: Usamos el arreglo de naves y agregamos todos los objetos que hemos creado 
• Luego crearemos un menú de opciones como método y lo llamaremos dentro del main

PARA EL MENU 

• Creamos un do While, dentro del do pondremos las opciones de nuestro menú, para guardar la opción que el usuario quiera consultar, este es el objeto tipo Scanner al 
que le pusimos de nombre entrada 
• Continuamos con el switch, en donde llamamos los diferentes métodos que les corresponden según la opción • El default es por si la persona ingresa un numero diferente al de las opciones, sepa que se equivocó y debe ingresar nuevamente la opción correcta • Y el ciclo do while se repetirá hasta que la opción sea diferente de 6, que son los ítems del menú.

METODOS DE LA CLASE MAIN (PARA EJECUTAR EL MENU)

Caso 1 

• El método de la opción 1 del menú que sería descripción de las naves, lo realizamos primero imprimiendo un texto con los tipos de nave, damos salto de línea 
y recorremos nuestro arreglo de NavesEspaciales con un for y ponemos de iterador naves. 
• Imprimimos el nombre, país y actividad; llamamos a cada uno con los getters. Como es un ciclo me va a recorrer todo el arreglo y los va a imprimir todos

Caso 2 

• Vamos a implementar el método abstracto de la clase padre, cada clase hija lo sobrescribe, lo que significa que todos viajan, pero no lo hacen de la misma forma. 
• En este caso cada tipo de nave viajan de la misma forma, entonces solo tomé 1 objeto de cada clase y le puse su método de viajar.

Caso 3 

• Es muy similar al 2 solo que se implementa el método abstracto de la función, que cada uno lo tiene, pero según el tipo de nave la función es diferente

Caso 4 

• Queremos consultar las misiones de la nave, que es el método propio que tiene cada clase hija. 
• Para ello imprimimos la etiqueta para especificar el tipo de nave que realizara el método. 
• Al inicio hicimos un Upcasting, es decir, cada objeto de la clase hija se guardó como la clase principal NavesEspaciales, si pusiera nada más por ejemplo lanzadera3
no me dejaría llamar el método de su clase, para solucionarlo debo hacer un DownCasting, es decir, bajarlo en la jerarquía de clases, para ello transformamos 
nuevamente Lanzaderas, al objeto lanzadera1 y ahora si llamamos su método

Caso 5 
• Para mostrar los ejemplos de cada nave, que está en la clase principal imprimimos la etiqueta ejemplo y hacemos el downCasting para que me deje llamar el método y concatenamos las etiquetas para que al imprimir se especifique a quien pertenece el ejemplo. • de esta manera terminamos nuestro código, los métodos los ponemos dentro de nuestro switch para que se puedan implementar y corremos nuestro programa
