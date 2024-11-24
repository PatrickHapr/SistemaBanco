/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbanco.utils;

public class Validador {
    public static boolean validaCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma1 = 0, soma2 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
            soma2 += digitos[i] * (11 - i);
        }
        soma2 += digitos[9] * 2;

        int verificador1 = 11 - (soma1 % 11);
        int verificador2 = 11 - (soma2 % 11);

        if (verificador1 >= 10) {
            verificador1 = 0;
        }
        if (verificador2 >= 10) {
            verificador2 = 0;
        }

        return verificador1 == digitos[9] && verificador2 == digitos[10];
    }

    public static boolean validaRg(String rg) {
        rg = rg.replaceAll("\\D", "");

        return rg.length() == 9;
    }
}