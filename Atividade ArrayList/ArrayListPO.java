/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist.po;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Camargo
 */
public class ArrayListPO {
    public static void main(String[] args) {
        List<Double> listaNotas = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in); {
            System.out.println("Adiciona 5 notas.");
            
            double i = 0;
            
            for (i = 0; i < 5; i++){
                System.out.println("Adicione a " +(int) i + "° nota: ");
                double numeroUser = sc.nextInt();
                listaNotas.add((int) i,numeroUser);
            }
            
            System.out.println(listaNotas);
            
            System.out.println("Escolha uma das notas para ser removida. Cite a POSIÇÃO do número, não o valor dele.");
            int a1 = sc.nextInt();
            
            listaNotas.remove(a1);
            
            System.out.println(listaNotas);
            
            double soma1 = 0;
            double soma2 = 0;
            
            for (int j = 0; j < 4; j++) {
                soma1 = listaNotas.get(j);
                soma2 = soma2 + soma1;
            }
            
            System.out.println("Soma dos números: " + soma2);
            System.out.println("Média final: " + soma2 / 4.0);
            
            listaNotas.sort(Comparator.reverseOrder());
            System.out.println(listaNotas);
        }
    }
    
}
