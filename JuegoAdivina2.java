
/**
 * Realice una un programa que muestre al usuario el siguiente menú:
 * Introduce un 1 si quieres que la máquina adivine el número
 * Introduce un 2 si quieres ser tú quien adivine el número
 * Si el usuario introduce un 1: Tendrás que hacer que el programa que adivine un número que
 * haya pensado previamente el usuario entre el 1 y el 100. El programa mostrará por pantalla un
 * número aleatorio entre 1 y 100 y el usuario le responderá si el número elegido por él es el
 * correcto, o es mayor o menor. El programa tendrá tantas oportunidades como necesite, y
 * cuando lo haya adivinado, se mostrarán el número total de los intentos que ha necesitado.
 * OJO:
 * ● El programa siempre tendrá que intentar acertar a partir de un número aleatorio
 * ● El programa tendrá que tener en cuenta si el usuario ha contestado si el número elegido
 * es mayor o menor para el cálculo del número aleatorio
 * Si el usuario introduce un 2: Tendrás que hacer que el programa que elija un número aleatorio
 * entre 1 y 100. Deberá pedir al usuario que elija un número y si no es el correcto le dirá si el
 * número elegido es mayor o menor. El usuario tendrá tantas oportunidades como necesite.
 * Cuando acierte, el programa le dará la enhorabuena y le mostrará el número de intentos que le
 * han hecho falta al usuario para conseguir llegar a este número.
 * Una vez acabado cualquiera de estos procesos, se deberá preguntar al usuario si quiere volver
 * a jugar, y en caso afirmativo volver a mostrar el menú inicial. En caso de que no el programa
 * terminará.
 */
import java.util.Scanner;
// PABLO CARRILLO PUNINA 1º Dam
public class JuegoAdivina2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            respuesta = menuInicial(sc);
            if (respuesta.equals("1")) {
                System.out.println("maquina adivina");
                maquinaAdivina(sc);
            } else {
                usuarioAdivina(sc);

            }

            respuesta = menuFinal();

        } while (respuesta.equalsIgnoreCase("si"));

    }

    public static String menuInicial(Scanner sc) {
        String modoJuego;

        boolean respuestaIncorrecta = false;
        do {
            System.out.println("Introduce un 1 si quieres que la maquina adivine el número: ");
            System.out.println("Introduce un 2 si quieres ser tú el que adivine el número: ");
            modoJuego = sc.nextLine();

            switch (modoJuego) {
                case "1":
                    return modoJuego;

                case "2":
                    return modoJuego;

                default:
                    System.out.println("Mensaje no valido, introduzca la respuesta correcta porfavor.");
                    respuestaIncorrecta = true;
            }

        } while (respuestaIncorrecta = true);
        return modoJuego;

    }

    public static void maquinaAdivina(Scanner sc) {
        int numMin = 1;
        int numMax = 100;
        int numAdivina = aleatorio(numMin, numMax);
        int intentos = 0;
        String respuesta = "";

        System.out.println(" Piensa en un numero entre 1 y 100 y cuando estes listo, pulsa intro: ");
        sc.nextLine();
        do {

            System.out.println("Es " + numAdivina + " tu numero: ");

            System.out.println("Responde con 'correcto', 'mayor' o 'menor'.");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("mayor")) {
                intentos++;
                numMin = numAdivina + 1;
                numAdivina = aleatorio(numMin, numMax);
            } else if (respuesta.equalsIgnoreCase("menor")) {
                intentos++;
                numMax = numAdivina - 1;
                numAdivina = aleatorio(numMin, numMax);
            } else if (respuesta.equalsIgnoreCase("correcto")) {
                intentos++;
                System.out.println("He adivinado tu numero en " + intentos + " intentos");
            } else {
                System.out.println("Mensaje no valido, introduzca la respuesta correcta porfavor.");
            }

        } while (!respuesta.equalsIgnoreCase("correcto"));

    }

    public static void usuarioAdivina(Scanner sc) {
        System.out.println("Adivina el numero");
        int contadorIntentos = 0, numeroMaquina = aleatorio(1, 100), numeroJugador = Integer.parseInt(sc.nextLine());
        do {

            if (numeroJugador < numeroMaquina) {
                contadorIntentos++;
                System.out.println("Mi numero es mayor");
                numeroJugador = Integer.parseInt(sc.nextLine());

            } else if (numeroJugador > numeroMaquina) {
                contadorIntentos++;
                System.out.println("Mi numero es menor");
                numeroJugador = Integer.parseInt(sc.nextLine());
            }

        } while (numeroJugador != numeroMaquina);
        contadorIntentos++;
        System.out.println("Enhorabuena!! has adivinado el numero en " + contadorIntentos + " intentos");

    }

    public static int aleatorio(int numMin, int numMax) {
        return (int) (Math.random() * (numMax - numMin + 1) + numMin);
    }

    public static String menuFinal() {
        Scanner fl = new Scanner(System.in);
        System.out.println("Quieres seguir jugando? SI/NO");
        String menu;

        boolean eleccionHecha = false;
        do {
            System.out.println("si");
            System.out.println("no");
            menu = fl.nextLine();
            menu = menu.toLowerCase();

            switch (menu) {
                case "si":
                    return menu;

                case "no":
                    System.out.println("Gracias por jugar!!! vuelve pronto pajarraco :D");
                    return menu;

                default:
                    System.out.println("Mensaje no valido, introduzca la respuesta correcta porfavor.");
                    eleccionHecha = true;

            }

        } while (eleccionHecha);

        return menu;
    }

}
