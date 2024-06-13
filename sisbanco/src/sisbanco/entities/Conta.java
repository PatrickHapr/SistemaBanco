/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco.entities;

/**
 *
 * @author Alves
 */
//Classe abstrata que vai ser herdada e implementa as funcoes da Interface
public abstract class Conta implements ContaI {
    protected Cliente dono;
    protected int numero;
    protected double saldo;

//Cria uma conta Padrao
    public Conta(Cliente dono, int numero, double saldoInicial) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

//Adiciona um valor no saldo caso seje maior que 0
    @Override
    public boolean deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

//  Retira um valor do saldo caso seja maior que zero e menor que o total do Saldo    
    @Override
    public boolean saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

//    Caso a funcao seja chamada, vai retornar o dono da conta
    @Override
    public Cliente getDono() {
        return dono;
    }
//    Caso a funcao seja chamada, vai retornar o numero da conta
    @Override
    public int getNumero() {
        return numero;
    }
//    Caso a funcao seja chamada, vai retornar o saldo da conta
    @Override
    public double getSaldo() {
        return saldo;
    }
//    Classe que vai ser diferente nos dois tipos de conta
    @Override
    public abstract void remunera();
}