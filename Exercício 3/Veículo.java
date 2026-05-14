public abstract Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public abstract void getInfo(){
        System.out.println("Marca:" + marca)
        System.out.println("Modelo:" + modelo)
    }

    public abstract double calcularConsumo();
} 