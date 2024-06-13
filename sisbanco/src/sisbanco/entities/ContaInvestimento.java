/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco.entities;

/**
 *
 * @author Alves
 */
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
        saldo *= 1.02; // Aplica 2% de remuneração
    }

    @Override
    public Cliente getDono() {
        return dono;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}