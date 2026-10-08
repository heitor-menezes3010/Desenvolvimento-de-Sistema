package saque.bancário;



public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(double saldo, double valorSaque) {
        super(String.format("Saldo insuficinete. Saldo disponível:  R$ %.2f. Valor solicitado: R$ %.2f.", saldo, valorSaque));
    }
    
}
