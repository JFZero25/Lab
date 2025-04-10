import javax.swing.plaf.TreeUI;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int seleccion;
        Crearmatriz();
        do {
            seleccion = scanner.nextInt();
            Mostraropciones();
            Ejecutar(seleccion);
        } while (seleccion != 0);
    }

    private static void Mostraropciones() {
        System.out.println("    Bienvenido   ");
        System.out.println("    1-Crear matriz   ");
        System.out.println("    2-Mostrar fila   ");
        System.out.println("    0-Salir   ");
    }

    private static void Ejecutar(int seleccion) {
        if (seleccion == 1) {
            Crearmatriz();
        }
        if (seleccion == 2) {
            int matriz[][];
            int fila = scanner.nextInt();
            Mostrarmatriz(matriz[][],fila);
        }
    }

    private static void Crearmatriz() {
        System.out.println("Cuantas filas");
        int filas = scanner.nextInt();
        Validar1(filas);
        System.out.println("cuantas columnas");
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];
        Llenarmatriz(matriz);
    }

    private static int Validar1(int filas) {
        if (filas > 0) {
            if (filas < 9) {
                return (filas);
            } else {
                System.out.println("Error de rango (<9)");
            }
        } else {
            System.out.println("Error de input");
        }
    }

    private static void Llenarmatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                Matrizcero(matriz);
            }
        }
    }

    private static void Mostrarmatriz(int matriz[][], int fila) {
        for (int j = 0; j < matriz[fila].length; j++) {
            System.out.println(matriz[fila][j]);
        }
    }

    private static void Matrizcero(int matriz[][]) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int suma = i + j;
                if (matriz[i][j] == 0) {
                    contador++;
                    if (contador / suma == 1 / 2) {
                        System.out.println("Es una matriz cero");
                    } else {
                        System.out.println("No es una matriz cero");
                    }
                }
            }
        }
    }
}
