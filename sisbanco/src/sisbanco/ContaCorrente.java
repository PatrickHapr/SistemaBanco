/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco;

/**
 *
 * @author UFPR
 */
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