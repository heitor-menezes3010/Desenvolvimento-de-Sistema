public class Carro {
    private Double cilindrada;

    public Carro(String marca, String modelo, Double cilindrada) {
        super(marca, modelo);
        this.cilindrada=cilindrada; 
    }
    @Override
    public double calcularConsumo() {
        return(15.0 - (cilindrada/200));
    }
}