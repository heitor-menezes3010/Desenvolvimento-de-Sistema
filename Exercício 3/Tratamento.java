package tratamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try { 
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            
            validarIdade(idade);
            System.out.println("Idade válida!");
            
        } catch (IdadeInvalidaException e) {
            System.out.println("Idade inválida");
        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida! Digite apenas números inteiros.");
        } finally {
            sc.close();
        }
    }
     public static void validarIdade(int idade) throws IdadeInvalidaException {
         if (idade > 120) {
             throw new IdadeInvalidaException("A idade não pode ser maior que 120.");
         }
     }
    
}
