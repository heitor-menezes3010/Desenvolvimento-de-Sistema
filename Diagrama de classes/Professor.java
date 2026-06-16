public class Professor extends Pessoa {

    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, String matricula, double salario, String disciplina) {
        super(nome, idade, matricula);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public double calcularBonus() {
        // Bônus de 15% sobre o salário
        return salario * 0.15;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: " + salario);
    }
}
