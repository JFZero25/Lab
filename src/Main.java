import javax.swing.plaf.TreeUI;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        int seleccion;
        Crearmatriz();
        do {
            seleccion = scanner.nextInt();
            Mostraropciones();
            Ejecutar(seleccion);
        }while (seleccion != 0) ;
    }

private static void Mostraropciones(){
        System.out.println("    Bienvenido   ");
        System.out.println("    1-Crear matriz   ");
        System.out.println("    2-Mostrar fila   ");
        System.out.println("    0-Salir   ");
}

private static void Ejecutar(int seleccion){
        if (seleccion==1){
            Crearmatriz();
        }
        if (seleccion==2){
            Mostrarmatriz(int matriz[][]);
        }
}

private static void Crearmatriz(){
    System.out.println("Cuantas filas");
    int ext;
    int filas=scanner.nextInt();
    Validar1(filas);
    System.out.println("cuantas columnas");
    int columnas=scanner.nextInt();
    Validar2(columnas);
    int [][] matriz=new int[filas][columnas];
    }

private static int Validar1(int filas){
        if (filas>0){
            if (filas<9) {
                return (filas);
            } else{
                System.out.println("Error de rango (<9)");
            }
        }else {System.out.println("Error de input");}

private static void Validar2(int colimnas){

}

private static void Llenarmatriz(int[][]matriz){

}
private static void Mostrarmatriz(int matriz[][]){

}
}