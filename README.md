# LAB 5.1: Aplicación 

## Capítulo 1: Creación proyecto Spring Boot

## Tutorial: Creación de un Proyecto Spring Boot con un Servicio "Hello World"

### 1. Introducción a Spring Boot
Spring Boot es un marco de trabajo de código abierto que simplifica el desarrollo de aplicaciones Spring independientes y de calidad de producción. Está construido sobre el Spring Framework y proporciona una variedad de herramientas, bibliotecas y convenciones para simplificar la configuración y el despliegue de aplicaciones.

### 2. Creación del Proyecto
Para comenzar, sigue estos pasos:

1. **Genera un nuevo proyecto Spring Boot**:
   - Utiliza la herramienta **Spring Initializr** en línea o tu IDE preferido (como IntelliJ IDEA o Eclipse).
   - Selecciona las siguientes opciones:
     - **Group**: net.codejava
     - **Artifact**: SpringBootHelloWorld
     - **Dependencies**: Elige "Web" para habilitar el manejo de solicitudes HTTP.
       ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/ce2ba266-7cc3-40b4-9cf0-62010c919b75)

       ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/33a9acfc-3e58-4859-af99-78f31d65c23d)

2. **Estructura del Proyecto**:
   - Descomprime el archivo descargado en una carpeta.
   - Abre el archivo `pom.xml` y elimina la dependencia `spring-boot-starter-test`.

### 3. Creación del Controlador
1. **Crea un controlador**:
   - Abre la clase `SpringBootHelloWorldApplication.java`.
   - Agrega la anotación `@RestController` a la clase.
   - Crea un método llamado `home()` con la anotación `@RequestMapping("/")` que devuelve un mensaje "Hello world Spring Boot".

     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/a17d3426-fdd9-4835-8079-96924adec0a6)


2. **Ejecuta la Aplicación**:
   - Ejecuta la aplicación usando el comando `mvn spring-boot:run`.
   - Accede a ella desde el navegador en [http://localhost:8080/](http://localhost:8080/).

3. **Personalización del Mensaje**:
   - Modifica el método `home()` para usar etiquetas HTML y agrega otro método con `@RequestMapping("/new")` que devuelva otro mensaje.

     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/a05b6249-2437-42ea-8a0b-b05029033360)


### 4. Empaquetado y Ejecución
1. **Empaqueta la Aplicación**:
   - Ejecuta `mvn package` para crear un archivo JAR ejecutable.

     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/f9465651-8646-4aa3-82fd-4ee92cd55c34)


2. **Ejecuta la Aplicación**:
   - Ejecuta la aplicación con el comando `java -jar target/SpringBootHelloWorld-0.0.1-SNAPSHOT.jar`.

     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/994f15d2-ab53-409f-8e52-df21c41a46df)


¡Listo! Ahora tienes un proyecto Spring Boot con un servicio "Hello World".

## Capítulo 2: Crear un proyecto para el front end.

### 1. Configuración Inicial
Antes de comenzar, asegúrate de tener **Node.js** y **npm** instalados en tu máquina. Si aún no los tienes, descárgalos e instálalos desde [Node.js official website](https://nodejs.org/).

### 2. Creación del Proyecto React
1. **Genera un nuevo proyecto React**:
   - Abre la terminal y ejecuta el siguiente comando para crear un nuevo proyecto React usando **Create React App**:
     ```bash
     npx create-react-app react-hello-world
     ```
   - Esto creará una carpeta llamada `react-hello-world` con la estructura básica de un proyecto React.

     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/18028cea-1022-4428-85c9-1ad6becf66ff)


2. **Navega al directorio del proyecto**:
   ```bash
   cd react-hello-world
   ```
   ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/5158c8a3-34e2-4e53-a68f-3fb62f06d1e6)

### 3. Consumiendo el Servicio Spring Boot
1. **Crea un componente React**:
   - En la carpeta `src`, crea un nuevo archivo llamado `HelloWorld.js`.
   - Dentro de este archivo, crea un componente funcional que renderice un mensaje "Hello World".
     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/1f588e68-c340-4d95-ba75-7e56be9a60ce)

    ![image](https://github.com/RulosS290/Lab5.1CVDS/assets/89041250/d4eb7b70-6671-4363-8238-89e862401352)


     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/3339d1f0-7f28-4367-aadf-1c23c72ba50d)


2. **Realiza una solicitud HTTP al servicio Spring Boot**:
   - En el mismo archivo `HelloWorld.js`, utiliza la función `fetch` o una librería como **axios** para hacer una solicitud GET al servicio Spring Boot.
   - La URL de la solicitud debe ser la misma que definimos en nuestro controlador Spring Boot (por ejemplo, `http://localhost:8080/clients`).

3. **Renderiza la respuesta en tu componente**:
   - Cuando recibas la respuesta del servicio, muestra el mensaje "Hello World" en tu componente React.

### 4. Ejecución del Proyecto React
1. **Inicia el servidor de desarrollo**:
   - Ejecuta el siguiente comando en la terminal:
     ```bash
     npm start
     ```
   - Esto abrirá automáticamente tu aplicación React en el navegador en [http://localhost:3000](http://localhost:3000).

2. **Verifica que el mensaje "Hello World" se muestre correctamente**:
   - Si todo funciona correctamente, deberías ver el mensaje "Hello World" en tu aplicación React.

### 5. Empaquetado y Despliegue
1. **Empaqueta tu aplicación React**:
   - Cuando estés listo para desplegar tu aplicación, ejecuta:
     ```bash
     npm run build
     ```
     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/c537c8ae-b8d4-473c-b852-ef2060ef7a04)

   - Esto creará una carpeta `build` con los archivos optimizados para producción.
  
     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/322f74f1-2f2e-4db8-8f44-c56d604636ac)


1. **Integra tu aplicación React con Spring Boot**:
   - Copia los archivos de la carpeta `build` generada en el directorio de recursos de tu proyecto Spring Boot (por ejemplo, `src/main/resources/static`).
   - Ahora, cuando ejecutes tu aplicación Spring Boot, también servirá la aplicación React.
  
     ![imagen](https://github.com/RulosS290/Lab5.1CVDS/assets/146139366/46312449-739d-4c88-99c1-984d48bd1341)


¡Listo! Ahora tienes un proyecto React que consume el servicio "Hello World" de Spring Boot.

## Capítulo 3: ´Configuración del CORS en ambos proyectos.

Como desarrollador fullstack con experiencia en React y Spring Boot, puedo ayudarte a configurar el **Cross-Origin Resource Sharing (CORS)** entre tus proyectos. Aquí tienes un paso a paso para habilitar CORS en un servicio "Hello, World" creado con Spring Boot:

1. **Crear un Proyecto Spring Boot**:
   - Si aún no tienes un proyecto Spring Boot, puedes crear uno utilizando [Spring Initializr](https://start.spring.io/). Asegúrate de incluir la dependencia de **Spring Web**.
   - Alternativamente, puedes descargar el proyecto preconfigurado desde [este repositorio](https://github.com/spring-guides/gs-rest-service-cors).

2. **Agregar la Anotación `@CrossOrigin`**:
   - En tu controlador Spring (donde defines tus endpoints), agrega la anotación `@CrossOrigin` a los métodos que deseas habilitar para CORS.
   - Por ejemplo, si tienes un endpoint `/api/hello`, puedes hacer lo siguiente:

    ```java
    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloController {

        @CrossOrigin
        @GetMapping("/api/hello")
        public String hello() {
            return "¡Hola, Mundo!";
        }
    }
    ```

   - La anotación `@CrossOrigin` le indica al navegador que este endpoint es accesible desde cualquier origen.

3. **Configurar Opciones Adicionales (Opcional)**:
   - Puedes personalizar la configuración de CORS agregando más opciones a la anotación `@CrossOrigin`. Por ejemplo:

    ```java
    @CrossOrigin(origins = "http://mi-frontend.com", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    ```

   - En este ejemplo, solo se permiten solicitudes desde `http://mi-frontend.com`, se aceptan todos los encabezados y se habilitan los métodos GET y POST.

4. **Prueba tu Servicio**:
   - Inicia tu aplicación Spring Boot y accede al endpoint `/api/hello` desde tu aplicación frontend (por ejemplo, una aplicación React).
   - Deberías poder recibir una respuesta exitosa sin errores de CORS.

¡Listo! Siguiendo estos pasos, habrás configurado correctamente CORS en tu servicio "Hello, World" de Spring Boot. Si tienes alguna pregunta adicional o necesitas más detalles, no dudes en preguntar. 😊
