/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco.entities;

/**
 *
 * @author Alves
 */
public class ContaCorrente extends Conta{
//    Tem Uma Variavel para o Limite de chao do Saldo da Conta
    private double limite;

//    Criar a Conta corrente
    public ContaCorrente(Cliente dono, int numero, double saldoInicial, double limite) {
        super(dono, numero, saldoInicial);
        this.limite = limite;
    }
//  Retira um valor do saldo caso seja maior que zero e menor que o limite   
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