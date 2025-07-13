# S4.01 - Introducción a Spring

---

# 🎯 Objetivos

- Familiarizarse con el **Protocolo HTTP**.
- Primer contacto con el framework **Spring Boot**.
- Aprender a usar **gestores de dependencias** (Maven/Gradle).
- Utilizar **Postman** para probar APIs.

---

## 🔹 Nivel 1

### 📘 Ejercicio Spring y Maven

Este ejercicio es un primer contacto con Spring y Maven.

Acceder a la página de **Spring Initializer** (👉 `https://start.spring.io/`) y generar un proyecto Spring Boot con las siguientes características:

- **PROJECT (gestor de dependencias):** Maven
- **LANGUAGE:** Java
- **SPRING BOOT:** La última versión estable.
- **PROJECT METADATA:**
    - **Group:** `cat.itacademy.s04.t01.n01`
    - **Artifact:** `S04T01N01`
    - **Name:** `S04T01N01`
    - **Description:** `S04T01N01`
    - **Package name:** `cat.itacademy.s04.t01.n01`
- **PACKAGING:** Jar
- **JAVA:** Mínimo versión 11

**Dependencias:**
- Spring Boot DevTools
- Spring Web

Importar el proyecto en vuestro IDE (Eclipse o IntelliJ IDEA) con la opción `File > Import > Existing Maven Project`.

En el archivo `application.properties`, configurar la variable `server.port` con el valor `9000`.

Convertiremos esta aplicación en una API REST:
- Dentro del paquete principal, crear un subpaquete llamado `controller`, y dentro de este, añadir la clase `HelloWorldController`.
- Deberá tener dos métodos: `String saluda` y `String saluda2`.
- Ambos métodos recibirán un parámetro `String` llamado `nombre`, y retornarán la frase: `"Hola, " + nombre + ". Estás ejecutando un proyecto Maven"`.

El primer método (`saluda`) responderá a una petición `GET` y deberá ser configurado para recibir el parámetro como un `@RequestParam`. El parámetro "nombre" tendrá el valor por defecto "UNKNOWN".
Deberá responder a:
- `http://localhost:9000/HelloWorld`
- `http://localhost:9000/HelloWorld?nombre=tuNombre`

El segundo método (`saluda2`) responderá a una petición `GET` y deberá ser configurado para recibir el parámetro como una `@PathVariable`. El parámetro "nombre" será opcional.
Deberá responder a:
- `http://localhost:9000/HelloWorld2`
- `http://localhost:9000/HelloWorld2/tuNombre`

#### Practicar Comandos Básicos de Maven

Asegurarnos de que Maven está instalado y configurado en el sistema. Abrir una terminal (desde el IDE o desde la línea de comandos de Windows, Mac, etc.) y navegar al directorio del proyecto. El objetivo es familiarizarse con algunos comandos importantes de Maven:

- **Compilar el Proyecto:** `mvn compile`
- **Empaquetar el Proyecto:** `mvn package`
- **Limpiar el Proyecto:** `mvn clean`
- **Ejecutar la Aplicación:** `mvn spring-boot:run`

---

## 🔹 Nivel 2

### 📘 Ejercicio Spring y Gradle

Este nivel es casi idéntico al nivel 1, pero utilizando Gradle como Gestor de Dependencias.

Acceder a la página de **Spring Initializr** (👉 `https://start.spring.io/`) y generar un proyecto Spring Boot con las siguientes características:

- **PROJECT (gestor de dependencias):** Gradle
- **LANGUAGE:** Java
- **SPRING BOOT:** La última versión estable.
- **PROJECT METADATA:**
    - **Group:** `cat.itacademy.s04.t01.n02`
    - **Artifact:** `S04T01N02`
    - **Name:** `S04T01N02`
    - **Description:** `S04T01N02`
    - **Package name:** `cat.itacademy.s04.t01.n02`
- **PACKAGING:** Jar
- **JAVA:** Mínimo versión 11

**Dependencias:**
- Spring Boot DevTools
- Spring Web

Importar el proyecto en el IDE (Eclipse o IntelliJ IDEA) con la opción `File > Import > Existing Gradle Project`.

En el archivo `application.properties`, configurar la variable `server.port` con el valor `9001`.

Convertiremos esta aplicación en una API REST:
- Dentro del paquete principal, crear un subpaquete llamado `controller`, y dentro de este, añadir la clase `HelloWorldController`.
- Deberá tener dos métodos: `String saluda` y `String saluda2`.

Ambos métodos recibirán un parámetro `String` llamado `nombre` y retornarán la frase: `"Hola, " + nombre + ". Estás ejecutando un proyecto Gradle"`.
El primer método (`saluda`) responderá a una petición `GET` y deberá ser configurado para recibir el parámetro como un `@RequestParam`. El parámetro "nombre" tendrá el valor por defecto "UNKNOWN".
Deberá responder a:
- `http://localhost:9001/HelloWorld`
- `http://localhost:9001/HelloWorld?nombre=tuNombre`

El segundo método (`saluda2`) responderá a una petición `GET` y deberá ser configurado para recibir el parámetro como una `@PathVariable`. El parámetro "nombre" será opcional.
Deberá responder a:
- `http://localhost:9001/HelloWorld2`
- `http://localhost:9001/HelloWorld2/tuNombre`

#### Practicar Comandos Básicos de Gradle

Asegurarnos de que Gradle está instalado y configurado en el sistema. Abrir una terminal (desde el IDE o desde la línea de comandos de Windows, Mac, etc.) y navegar al directorio del proyecto. El objetivo es familiarizarse con algunos comandos importantes de Gradle:

- **Compilar el Proyecto:** `gradle build`
- **Empaquetar el Proyecto:** `gradle assemble`
- **Limpiar el Proyecto:** `gradle clean`
- **Ejecutar la Aplicación:** `gradle bootRun`

---

## 🔹 Nivel 3

### 📘 Ejercicio Postman

Se trata de probar los proyectos anteriores desde Postman.

Crear dos entornos en Postman:
- **Proyecto Maven**
- **Proyecto Gradle**

Ambos entornos tendrán dos variables:
- **`Servidor`**: En ambos casos tendrá el valor `http://localhost`
- **`Puerto`**: En el caso del proyecto Maven tendrá el valor `9000`, y en el caso del proyecto Gradle, `9001`.

**¿Qué se debe entregar? (4 archivos):**
- Los dos entornos exportados.
- Una captura de pantalla por cada entorno, donde se vea la ejecución desde Postman usando el entorno y las variables definidas en ellos.
- Probar la URL: `http://localhost:xxxx/HelloWorld/tuNombre`, o cualquier otra de las que admiten los dos proyectos. (Recordad que para que la ejecución funcione correctamente, deberán estar en ejecución los dos proyectos en vuestro editor).

Ejecutar desde el editor los proyectos creados en los dos niveles anteriores, y mostrad el retorno obtenido en cada proyecto cuando se realizan algunas de las peticiones disponibles, utilizando los entornos creados y sus variables.

Se deberá entregar dos capturas de pantalla, una para la ejecución de cada entorno, y dos archivos con formato JSON con los entornos exportados.

---

# 🛠️ Tecnologías Utilizadas

- Java 11 o superior
- Spring Boot
- Maven
- Gradle
- HTTP Protocol
- Postman

---

## ⚙️ Instalación & Ejecución

### 📋 Requisitos

Para ejecutar este proyecto, necesitamos:

- Java Development Kit (JDK) 21 o superior
- Eclipse o IntelliJ IDEA
- Git

### 🛠️ Instalación

1.  Asegurarnos de que **JDK 21** o superior está instalado.
2.  Clonar este repositorio:
    ```sh
    git clone https://github.com/DiegoBalaguer/S0401-introductionToSpring.git
    ```
3.  Abrir el proyecto con vuestro IDE preferido (Eclipse o IntelliJ IDEA) como un proyecto Maven o Gradle existente, según corresponda a cada nivel.

### ▶️ Ejecución

1.  Desde el IDE:
    - Abrir la clase principal de cada proyecto (la que contiene el método `main()`, que inicia la aplicación Spring Boot).
    - Ejecutar el archivo directamente utilizando la configuración de ejecución de tu IDE.
2.  Desde la terminal:
    - Navegar al directorio raíz del proyecto (donde se encuentra `pom.xml` para Maven o `build.gradle` para Gradle).
    - Para el proyecto Maven: `mvn spring-boot:run`
    - Para el proyecto Gradle: `gradle bootRun`

---

# 🌐 Despliegue

Este proyecto es para **fines educativos** y está destinado para **desarrollo local únicamente**. No se requiere despliegue ni un entorno externo.

---

## 📦 Repositorio

Puedes encontrar el código fuente completo en GitHub:
🔗 👉 https://github.com/DiegoBalaguer/S0401-introductionToSpring.git

---

## ✅ Notas del Autor

Estos ejercicios están diseñados para darnos experiencia práctica con los fundamentos de Spring Boot, el uso de gestores de dependencias como Maven y Gradle, y la prueba de APIs con Postman.

¡Siéntete libre de explorar, modificar y expandir el código base!

¡Feliz codificación! 🚀"# S0401-introductionToSpring" 
