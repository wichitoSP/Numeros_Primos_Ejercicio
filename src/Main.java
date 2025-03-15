import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creamos nuestra variable  tipo objeto para solicitar el usuario

        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese un número entero positivo al programa
        System.out.print("Ingrese un número entero Positivo:  ");

        int limite = scanner.nextInt(); // Se crea la variable limite

        // Se crea la condicional para evaluar el número positivo
        if (limite < 2){

            System.out.println("No hay números primos  en el rango espesificado:  ");

        }else {
            System.out.println("Números primos entre 1 y "+limite+":");

            for (int i = 2; i <= limite; i++){ // Se crea el ciclo for para la validación de nuestro programa

                System.out.println(i);



            }
        }



    }
}