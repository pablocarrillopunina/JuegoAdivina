# Juego Adivina el Número

Este es un programa que permite al usuario jugar a un juego en el que puede elegir entre dos opciones:
1. **Que la máquina adivine el número** que el usuario ha pensado entre 1 y 100.
2. **Ser el usuario quien adivine el número** que la máquina ha pensado entre 1 y 100.

## Descripción del Juego

El programa tiene un menú con las siguientes opciones:

1. **Máquina adivina el número**:  
   - El programa generará un número aleatorio entre 1 y 100.
   - El usuario le dirá al programa si el número elegido es el correcto, mayor o menor.
   - El programa intentará adivinar el número con base en las respuestas del usuario, haciendo tantos intentos como sean necesarios.
   - Una vez adivinado, el programa mostrará el número total de intentos realizados.

2. **El usuario adivina el número**:  
   - El programa generará un número aleatorio entre 1 y 100 y lo mantendrá en secreto.
   - El usuario deberá intentar adivinar el número.
   - El programa le dirá si el número elegido por el usuario es mayor o menor que el número secreto.
   - El programa le dirá al usuario si ha acertado y le mostrará cuántos intentos le ha tomado adivinarlo.

## Características del Programa

- El programa debe seguir un flujo de interacción donde se manejan dos posibles roles: el de la máquina adivinando y el del usuario adivinando.
- El juego repetirá las rondas hasta que el usuario decida no continuar.
- El número de intentos que se realicen en ambos modos del juego será registrado y mostrado al final.

## Instrucciones de Uso

1. Ejecute el programa.
2. Se mostrará un menú inicial. Elija:
   - **1** si desea que la máquina adivine el número que pensó.
   - **2** si desea adivinar el número que ha pensado la máquina.
3. Según la opción seleccionada, el juego continuará hasta que se haya adivinado el número o el usuario decida terminar el juego.

## Requisitos

- Java 8 o superior.
- Un entorno de desarrollo como IntelliJ IDEA 



