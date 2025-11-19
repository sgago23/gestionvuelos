# Gestión de Vuelos ✈️

Aplicación Java de consola que permite gestionar y filtrar una lista de vuelos en función de diferentes criterios de fechas.  
El objetivo principal del ejercicio es practicar el uso de `LocalDate`, colecciones y programación orientada a objetos.

---

## 📌 Objetivo del ejercicio

Desarrollar un programa en Java que:

- Defina una lista de vuelos de prueba.
- Permita filtrar esos vuelos según **distintos criterios de búsqueda basados en fechas**.
- Muestre los resultados por consola.
- Devuelva los vuelos siempre **ordenados por fecha de salida**.

---

## 🛠 Tecnologías utilizadas

- Java (versión 8 o superior — se usa `java.time.LocalDate`)
- IntelliJ IDEA (u otro IDE)
- Programación Orientada a Objetos (POO)

*(El proyecto puede ser Java simple o Maven; la lógica es independiente de la herramienta de construcción.)*

---

## 🧱 Estructura del proyecto

```text
src/
 └── main/
     └── java/
         ├── entities/
         │    └── Vuelo.java
         ├── utils/
         │    └── filtroVuelos.java
         └── Main.java
