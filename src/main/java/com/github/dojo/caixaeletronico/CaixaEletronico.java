package com.github.dojo.caixaeletronico;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Desafio Caixa Eletrônico: https://dojopuzzles.com/problems/caixa-eletronico/
 * Desenvolva um programa que simule a entrega de notas quando um cliente
 * efetuar um saque em um caixa eletrônico. Os requisitos básicos são os
 * seguintes:
 * 
 * Entregar o menor número de notas; É possível sacar o valor solicitado com as
 * notas disponíveis; Saldo do cliente infinito; Quantidade de notas infinito
 * (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do
 * problema); Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
 * 
 * Exemplos:
 * 
 * Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1
 * nota de R$ 10,00. Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1
 * nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.
 */
public class CaixaEletronico {

    public Map<Integer, Integer> sacar(int valorSacar) {
        if (valorSacar % 10 != 0 || valorSacar <= 0) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> valorSacado = new TreeMap<>(Collections.reverseOrder());
        valorSacado.put(10, 0);
        valorSacado.put(20, 0);
        valorSacado.put(50, 0);
        valorSacado.put(100, 0);
        
        int resto = valorSacar;
        for(Entry<Integer, Integer> entry : valorSacado.entrySet()) {
            valorSacado.put(entry.getKey(), resto / entry.getKey());
            resto = resto % entry.getKey();
        }
        return valorSacado;
    }
}
