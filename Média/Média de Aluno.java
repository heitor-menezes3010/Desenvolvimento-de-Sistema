package mynombreescarlo;
import java.util.Scanner;
public class Mynombreescarlo {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        
      //coleta de informação
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o nome da escola: ");
        String escola = scanner.nextLine();
        
        double somaNotas = 0;
        int totalNotas = 6;
        
        //loop
        for (int i = 1; i <= totalNotas; i++){
            double nota;
        
        //verifiação
            while(true) {
                System.out.println("Digite a nota " + i + "(0 a 10): ");
                nota = scanner.nextDouble();
            
                if(nota >= 0 && nota <= 10){
                break;
            
                } else {
                System.out.println("ERRO! A nota deve ser entre 0 e 10. Tente Novamente.");
                }
            }
            somaNotas += nota;
        
    }
        double media = somaNotas / totalNotas;
        
        System.out.println("\n--- Boletim Escola ---");
        System.out.println("Escola" + escola);
        System.out.println("Aluno" + nome);
        System.out.println("Média Final: " + media);
        
        //verificação simples
        if(media >= 7){
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
        
        scanner.close();
    }
        
   }
