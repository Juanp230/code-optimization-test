(store):Hicimos varias mejoras al código, incluida la eliminación de números mágicos reemplazándolos con constantes con nombre. También introdujimos matrices para manejar precios y cantidades dinámicamente, lo que nos permitió calcular las ventas totales de manera más eficiente al iterar sobre estas matrices. Este enfoque no sólo eliminó el código redundante sino que también hizo que los procesos de cálculo y comparación fueran más escalables y flexibles.

(calculadora de impuestos): Realizamos la eliminacion de los numeros magicos que se encontraban en el codigo incluimos los arreglos para  múltiples productos y tasas de impuestos. y alñadimos el buvle for que nos permitio mejorar el calculo.

(Agevalidation): Importamos la clase Scanner para poder leer la entrada del usuario.
Definimos la clase AgeValidation como contenedor del código.
Establecimos una constante AGE_LIMIT con el valor 18, que es el límite de edad.
Creamos el método main, que es donde se ejecuta el programa.
Instanciamos Scanner para leer la entrada desde la consola.
Solicitamos al usuario su edad con un mensaje.
Leimos la edad ingresada y la almacené en la variable age.
Verificamos si la edad es mayor o igual a 18: si es así, mostré “Access granted”.
Si la edad es menor a 18, mostré “Access denied”.
Cerramos el escáner para liberar recursos.
Y así, validamos la edad del usuario para determinar su acceso.