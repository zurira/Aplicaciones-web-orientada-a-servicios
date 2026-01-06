import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero=0;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNumeros\nSi deseas salir, ingresa 0\n");
        do{
            System.out.println("\nIngresa un numero");
            numero = sc.nextInt();
            if(numero == 0){
                System.out.println("Saliendo....");
            }else{
                System.out.println("El número ingresado es: " +numero);
                suma += numero;
            }

        }while(numero>0);

        System.out.println("\nLa suma es: " + suma);
    }
}