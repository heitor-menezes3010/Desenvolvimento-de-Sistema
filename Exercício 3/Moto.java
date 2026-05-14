public class Moto {
    private int cilindradas;

    public Carro(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas=cilindradas; 
    }
    @Override
    public double calcularConsumo() {
        return(30.0 - (cilindradas/100));
    }
}