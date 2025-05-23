# Proyecto de Álgebra Lineal: Solucionador de Sistemas de Ecuaciones

[![Lenguaje](https://img.shields.io/badge/Lenguaje-Java-blue)](https://www.java.com/)
[![Algoritmo](https://img.shields.io/badge/Algoritmo-Eliminación%20Gaussiana%20%26%20Sustitución%20Regresiva-green)]()

Este proyecto es una aplicación simple en Java usado para resolver un sistema de ecuaciones lineales. El usuario ingresa las dimensiones de una matriz aumentada (representando los materiales y productos) y sus coeficientes. Luego, la aplicación aplica el método de eliminación de Gauss y la sustitución regresiva para encontrar la solución del sistema.

## Descripción

El programa está diseñado para resolver sistemas de ecuaciones lineales del tipo `Ax = B`, donde `A` es la matriz de coeficientes (materiales necesarios por producto) y `B` es el vector de términos independientes (cantidad total de cada material disponible). El objetivo es determinar la cantidad de cada producto que se puede fabricar.

El proceso es el siguiente:
1.  El usuario especifica el número de filas (materiales) y columnas (productos).
2.  El usuario ingresa los coeficientes de la matriz aumentada (materiales por producto y la cantidad total de cada material).
3.  El programa aplica el método de eliminación de Gauss para transformar la matriz en una forma escalonada superior.
4.  Se aplica la sustitución regresiva para encontrar los valores de cada variable (cantidad de cada producto).
5.  La solución se imprime en la consola.

## Estructura del Proyecto

*   `src/ProyectoLineal.java`: Contiene el código fuente principal de la aplicación Java.
*   `README.md`: Este archivo de descripción.

## Tecnologías Utilizadas

*   **Lenguaje de Programación:** Java
*   **Interfaz Gráfica:** Java Swing (a través de `JOptionPane` para la entrada y salida de datos simple).
*   **Algoritmos:**
    *   Eliminación Gaussiana (con pivoteo parcial para mejorar la estabilidad numérica).
    *   Sustitución Regresiva.


## Ejemplo de Uso: Planificación de Producción en una Carpintería

Imaginemos una pequeña carpintería que fabrica dos productos principales: **Mesas** y **Sillas**. Para fabricar estos productos, se utilizan dos recursos principales: **Madera** (medida en metros cuadrados) y **Horas de Trabajo**.

**Requisitos de Recursos por Producto:**
*   Para fabricar **1 Mesa**: se necesitan 5 m² de madera y 2 horas de trabajo.
*   Para fabricar **1 Silla**: se necesitan 1 m² de madera y 3 horas de trabajo.

**Disponibilidad de Recursos:**
*   La carpintería dispone de un total de **30 m² de madera**.
*   La carpintería dispone de un total de **25 horas de trabajo**.

**El Problema:**
La carpintería quiere saber cuántas mesas (P1) y cuántas sillas (P2) puede fabricar para utilizar exactamente todos sus recursos disponibles. Esto se traduce en el siguiente sistema de ecuaciones lineales:

1.  Ecuación de Madera: `5*P1 + 1*P2 = 30`
2.  Ecuación de Horas de Trabajo: `2*P1 + 3*P2 = 25`

**Ingresando los Datos en el Programa:**

1.  **Cantidad de filas (materiales):** 2 (porque tenemos dos recursos: Madera y Horas de Trabajo)
2.  **Cantidad de columnas (productos):** 2 (porque fabricamos dos productos: Mesas y Sillas)

3.  **Matriz Aumentada:** El programa te pedirá ingresar los datos fila por fila. La matriz aumentada sería:
    ```
    [ 5   1 | 30 ]  // Fila 1: Coeficientes de Madera para P1, P2, y total de Madera
    [ 2   3 | 25 ]  // Fila 2: Coeficientes de Horas para P1, P2, y total de Horas
    ```
    Esto significa que ingresarías:
    *   Fila 1, Columna 1 (Madera para Mesas): `5`
    *   Fila 1, Columna 2 (Madera para Sillas): `1`
    *   Fila 1, Columna 3 (Total Madera Disponible): `30`
    *   Fila 2, Columna 1 (Horas para Mesas): `2`
    *   Fila 2, Columna 2 (Horas para Sillas): `3`
    *   Fila 2, Columna 3 (Total Horas Disponibles): `25`

**Solución Esperada (Salida en Consola):**
Después de que el programa procese estos datos, la salida en la consola será:
 ```
Producto 1 = 5.0 // Es decir, 5 Mesas
Producto 2 = 5.0 // Es decir, 5 Sillas
 ```
**Interpretación:**
Esto significa que la carpintería puede fabricar 5 mesas y 5 sillas para utilizar exactamente los 30 m² de madera y las 25 horas de trabajo disponibles.

## Posibles Mejoras (Ideas para el futuro)

*   Implementar una interfaz gráfica más robusta en lugar de `JOptionPane` (por ejemplo, usando Java Swing completo o JavaFX).
*   Manejo de errores más detallado (por ejemplo, si el sistema no tiene solución única, o si se ingresan datos no numéricos).
*   Permitir al usuario ver la matriz transformada después de la eliminación gaussiana.
*   Opción para guardar/cargar matrices desde archivos.

---
*Este proyecto fue creado con fines educativos para aplicar conceptos de álgebra lineal.*
