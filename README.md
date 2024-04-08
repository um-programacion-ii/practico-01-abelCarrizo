# Practico 1

Consigna
Realizar cada item en una branch diferente, cada branch debe partir de la anterior sin necesidad de hacer merge previamente.

- [x] 1. Crear la entidad Ingrediente con los atributos nombre y cantidad. Hacer constructores, getter, setter y sobrecargar toString(). Hacer una clase que contenga main que cree Ingrediente's y los muestre por pantalla.

- [x] 2. Agregar a la entidad Ingrediente el método sacar() que permita disminuir la cantidad del Ingrediente verificando que haya una cantidad suficiente para ser sacada. Además crear una entidad Despensa que tenga un arreglo de Ingrediente. Implementar el método addIngrediente para agregar un Ingrediente a la despensa. Implementar el método getIngrediente que me permita sacar una cantidad determinada del Ingrediente sin eliminarlo de la despensa. Hacer una clase que contenga main que verifique el funcionamiento de lo solicitado.

- [x] 3. Implementar una clase Receta que tenga los atributos tiempoCoccion y el atributo ingredientes como arreglo de Ingrediente y el atributo preparacion. Esta será la clase base para otras clases que se agregarán como por ejemplo HuevoDuro que tendrá en el arreglo 2 ingredientes (huevo y agua), tiempo de coccion 10 minutos y en preparación poner un huevo en agua hirviendo durante 10 minutos. Construir al menos 3 clases heredadas con recetas diferentes Hacer una clase que contenga main que pruebe lo solicitado.

- [x] 4. Crear una entidad Chef que contenga los atributos nombre y estrellasMichelin, hacer los constructores, setter, getters y sobrecargar toString. Agregar una clase CocinaService que la usará el Chef para preparar alguna de las recetas implementadas. Primero el Chef debe verificar que tiene los Ingrediente's necesarios para preparar la receta, si no los tiene deberá mostrar el mensaje que no alcanzan los ingredientes de la despensa y mostrar cuánto falta de los ingredientes necesarios. En el caso de que alcancen deberá mostrar la preparación y la cantidad de Ingrediente's que quedan en la despensa al final de la preparación. No es necesaria la interacción del usuario, pero se debe construir un escenario que nos muestre la salida teniendo en cuenta todas las posibilidades.
