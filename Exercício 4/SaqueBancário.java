package saque.bancário;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaqueBancário {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Saldo disponível: ");
            double saldo = sc.nextDouble();
            
            System.out.println("Valor do saque");
            double valorSaque = sc.nextDouble();
            
            saldo = sacar(saldo, valorSaque);
            System.out.println(saldo);
            
        }catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Erro: informe apenas valores numéricos.");
        }finally {
            System.out.println("Operação Finalizada");
            sc.close();
        }
    }
    
    public static double sacar(double saldo, double valorSaque)
            throws SaldoInsuficienteException {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero");
        }
        if (valorSaque > saldo) {
            throw new SaldoInsuficienteException(saldo, valorSaque);
        }
        return saldo - valorSaque;
    }
    
}
