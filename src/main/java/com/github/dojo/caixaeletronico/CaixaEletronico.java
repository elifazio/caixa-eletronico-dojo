package com.github.dojo.caixaeletronico;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Desafio Caixa Eletrônico: https://dojopuzzles.com/problems/caixa-eletronico/
 * Desenvolva um programa que simule a entrega de notas quando um cliente
 * efetuar um saque em um caixa eletrônico. Os requisitos básicos são os
 * seguintes:
 * 
 * Entregar o menor número de notas; É possível sacar o valor solicitado com as
 * notas disponíveis; 
 * Saldo do cliente infinito; Quantidade de notas infinito
 * (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do
 * problema); Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
 * 
 * Exemplos:
 * 
 * Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1
 * nota de R$ 10,00. 
 * Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1
 * nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.
 */
public class CaixaEletronico {

    public Integer[] sacar(int valorSacar) {

        Integer[] valorSacado = new Integer[4];
        
        valorSacado = new Integer[] { 0, 0, 0, 0 };

        int resto = 0;

        if (valorSacar % 10 != 0 || valorSacar <= 0) {
            throw new IllegalArgumentException();
        }

        // if (valorSacar % 10 == 0 ){
        //      return valorSacar / 10;              
        // }
        valorSacado[0] = valorSacar / 100;
        resto = valorSacar % 100;
        if (resto > 0) {
            valorSacado[1] = resto / 50;
            resto = resto % 50;
        }
        
        if (resto > 0) {
            valorSacado[2] = resto / 20;
            resto = resto % 20;
        }

        if (resto > 0) {
            valorSacado[3] = resto / 10;
            resto = resto % 10;
        }
        

        while (resto > 0) {

        }

        return valorSacado;
    }
}
