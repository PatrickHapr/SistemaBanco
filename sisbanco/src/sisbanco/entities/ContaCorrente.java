package sisbanco.entities;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(Cliente dono, int numero, double saldoInicial, double limite) {
        super(dono, numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0 && (saldo - valor >= -limite)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void remunera() {
        saldo *= 1.01; 
    }
}