import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Controle
 * Le repetidamente nome e notas de alunos ate o usuario digitar "fim" no nome.
 * Ao final, calcula a media da turma, quantos foram aprovados, quantos foram
 * para final, quantos foram reprovados e mostra os codigos (posicao na lista)
 * dos alunos cujas notas ficaram abaixo da media da turma.
 */
public class Controle {

    // Faixas de aprovacao (ajuste conforme o criterio do seu professor)
    private static final double MEDIA_APROVACAO = 70.0;
    private static final double MEDIA_MINIMA_FINAL = 40.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do aluno (ou \"fim\" para encerrar): ");
            String nome = sc.nextLine();

            // Usa equals para comparar Strings corretamente
            if (nome.equals("fim")) {
                break;
            }

            int nota1 = lerNota(sc, "Digite a 1a nota parcial (0 a 100): ");
            int nota2 = lerNota(sc, "Digite a 2a nota parcial (0 a 100): ");

            Aluno aluno = new Aluno(nome, nota1, nota2);
            alunos.add(aluno);
        }

        sc.close();

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno foi cadastrado.");
            return;
        }

        // ---- Calcula a media da turma ----
        double somaMedias = 0;
        for (Aluno a : alunos) {
            somaMedias += a.getMedia();
        }
        double mediaTurma = somaMedias / alunos.size();

        // ---- Conta aprovados, final e reprovados ----
        int aprovados = 0;
        int paraFinal = 0;
        int reprovados = 0;

        for (Aluno a : alunos) {
            double media = a.getMedia();
            if (media >= MEDIA_APROVACAO) {
                aprovados++;
            } else if (media >= MEDIA_MINIMA_FINAL) {
                paraFinal++;
            } else {
                reprovados++;
            }
        }

        // ---- Exibe o resultado ----
        System.out.println("\n===== Resultado da turma =====");
        System.out.printf("Media da turma: %.2f%n", mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos para final: " + paraFinal);
        System.out.println("Alunos reprovados: " + reprovados);

        // ---- Codigos (posicao na lista, comecando em 1) dos alunos
        //      cujas notas ficaram abaixo da media da turma ----
        System.out.println("\nAlunos com media abaixo da media da turma:");
        boolean algumAbaixo = false;
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            if (a.getMedia() < mediaTurma) {
                int codigo = i + 1; // codigo = posicao na lista (1-based)
                System.out.println("Codigo " + codigo + " - " + a);
                algumAbaixo = true;
            }
        }
        if (!algumAbaixo) {
            System.out.println("Nenhum aluno ficou abaixo da media da turma.");
        }
    }

    // Metodo auxiliar para ler e validar uma nota entre 0 e 100
    private static int lerNota(Scanner sc, String mensagem) {
        int nota;
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine();
            try {
                nota = Integer.parseInt(entrada);
                if (nota < 0 || nota > 100) {
                    System.out.println("A nota deve estar entre 0 e 100.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
            }
        }
        return nota;
    }
}
