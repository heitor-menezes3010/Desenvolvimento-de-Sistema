package jaaj;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        /**
        int [] a = new int[31];
        for (int i = 0; i <= a.length; i++)
        {
            System.out.println("Coloque a temperatura do dia " + i + ": ");
            int n = scanner.nextInt();
            a[i] = n;
        }
        for (int i = 0; i <= a.length; i++){
            System.out.print(a[i] + " ");
        }
        scanner.close();
        **/
        int [] soma = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < soma.length; i++){
            int resultado = 0;
            System.out.println("Coloque o primeiro número: ");
            int a = sc.nextInt();
        
            System.out.println("Coloque o segundo número: ");
            int b = sc.nextInt();
        
            System.out.println("Coloque a operação com o símbolo representante dela (+, -, *, /, %): ");
            char operation = sc.next().charAt(0);
        
            if (operation == '+') {
                System.out.println(a + b);
                resultado = a + b;
            }
            else if (operation == '-') {
                System.out.println(a - b);
                resultado = a - b;
            }
            if (operation == '*') {
                System.out.println(a * b);
                resultado = a * b;
            }
            else if (operation == '/'){
                System.out.println(a / b);
                resultado = a / b;
            }
            if (operation == '%') {
                System.out.println(a % b);
                resultado = a % b;
            }
            soma[i] = resultado;
        }
        for (int i = 0; i < soma.length; i++){
            System.out.print(soma[i] + " ");
        }
        sc.close();
    }   
}