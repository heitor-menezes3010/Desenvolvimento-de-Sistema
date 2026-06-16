public class Aluno extends Pessoa {

    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, String matricula, double nota1, double nota2) {
        super(nome, idade, matricula);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        double media = calcularMedia();

        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4 && media < 6) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public double calcularBonus() {
        // Alunos não recebem bônus
        return 0;
    }
}
