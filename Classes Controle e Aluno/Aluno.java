/**
 * Classe Aluno
 * Representa um aluno com nome e duas notas parciais (0 a 100).
 */
public class Aluno {

    private String nome;
    private int notaParcial1;
    private int notaParcial2;

    // Construtora: recebe nome e as duas notas
    public Aluno(String nome, int notaParcial1, int notaParcial2) {
        this.nome = nome;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
    }

    // ----- Métodos "get" (ler os atributos) -----
    public String getNome() {
        return nome;
    }

    public int getNotaParcial1() {
        return notaParcial1;
    }

    public int getNotaParcial2() {
        return notaParcial2;
    }

    // ----- Métodos "set" (escrever os atributos) -----
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaParcial1(int notaParcial1) {
        this.notaParcial1 = notaParcial1;
    }

    public void setNotaParcial2(int notaParcial2) {
        this.notaParcial2 = notaParcial2;
    }

    // Calcula a média das duas notas parciais deste aluno
    public double getMedia() {
        return (notaParcial1 + notaParcial2) / 2.0;
    }

    @Override
    public String toString() {
        return nome + " (Nota1=" + notaParcial1 + ", Nota2=" + notaParcial2
                + ", Media=" + String.format("%.2f", getMedia()) + ")";
    }
}
