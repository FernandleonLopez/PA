Sistema de registro y control de productos
Descripción

Este proyecto es un sistema básico hecho en Java para registrar y controlar productos desde la consola.

El programa permite registrar productos, mostrar los productos registrados y realizar operaciones con el stock.

Las opciones principales son:

Registrar productos.
Mostrar productos.
Aumentar stock.
Disminuir stock.
Verificar stock.
Salir del programa.
Integrantes
Paris Fernando León López
Integrante 2
Integrante 3
Integrante 4
Archivos del proyecto

El proyecto tiene los siguientes archivos:

Producto.java: contiene la clase Producto, sus atributos, constructor y métodos.
SistemaProductos.java: contiene el programa principal y el menú.
README.md: contiene la información del proyecto.
Cómo ejecutar

Primero se debe abrir la carpeta del proyecto en Visual Studio Code.

Luego abrir la terminal y ejecutar:

javac Producto.java SistemaProductos.java

Después:

java SistemaProductos

El programa mostrará un menú donde se puede elegir qué operación realizar.

Cómo está hecho

Se creó la clase Producto para guardar los datos de cada producto:

Código
Nombre
Precio
Stock

También se crearon métodos para mostrar la información, aumentar el stock, disminuirlo y verificar si hay stock disponible.

En SistemaProductos se encuentra el menú principal y las opciones para trabajar con los productos.

Para controlar el funcionamiento del programa se utilizan if, switch, for y do-while.

Prueba

Para probar el programa se puede registrar un producto, por ejemplo:

Código: P001
Nombre: Teclado
Precio: 120
Stock: 10

Después se puede registrar otro producto y utilizar las diferentes opciones del menú para comprobar que el sistema funciona correctamente.
