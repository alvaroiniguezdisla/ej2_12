package aplicacion;
import java.util.Scanner;
import dominio.ej2_12;
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número ");
        int num=sc.nextInt();
        System.out.println(" El elemento "+num+" de la sucesión de fibonacci es  "+ej2_12.fib(num));

    }
}
