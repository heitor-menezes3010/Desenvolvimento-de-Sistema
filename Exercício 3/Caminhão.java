public class Caminhão {
    private Double capacidadeCarga;

    public Carro(String marca, String modelo, Double capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga=capacidadeCarga; 
    }
    @Override
    public double calcularConsumo() {
        return(5.0 - (capacidadeCarga / 1000.0));
    }
}