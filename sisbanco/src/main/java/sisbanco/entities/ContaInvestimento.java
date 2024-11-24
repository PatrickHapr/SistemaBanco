package sisbanco.entities;

public class ContaInvestimento extends Conta {
    private double montanteMinimo;
    private double depositoMinimo;

    public ContaInvestimento(Cliente dono, int numero, double saldoInicial, double montanteMinimo, double depositoMinimo) {
        super(dono, numero, saldoInicial);
        this.montanteMinimo = montanteMinimo;
        this.depositoMinimo = depositoMinimo;
    }

    @Override
    public boolean deposita(double valor) {
        if (valor >= depositoMinimo) {
            return super.deposita(valor);
        } else {
            System.out.println("Depósito não realizado. O valor é menor que o depósito mínimo.");
            return false;
        }
    }

    @Override
    public boolean saca(double valor) {
        if (saldo - valor >= montanteMinimo) {
            return super.saca(valor);
        } else {
            System.out.println("Saque não realizado. O saldo não pode ser menor que o montante mínimo.");
            return false;
        }
    }

    @Override
    public void remunera() {
        saldo *= 1.02;
    }
    public double getMontanteMinimo() {
        return this.montanteMinimo;
    }

    public double getDepositoMinimo() {
        return this.depositoMinimo;
    }
}