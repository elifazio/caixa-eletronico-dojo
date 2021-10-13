package com.github.dojo.caixaeletronico;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste para Dojo do desafio Caixa Eletrônico
 * 
 * Desafio Caixa Eletrônico: https://dojopuzzles.com/problems/caixa-eletronico/
 */
public class CaixaEletronicoTest {

    private CaixaEletronico caixaEletronico;

    private Map<Integer, Integer> valorSacado = new TreeMap<>(Collections.reverseOrder());

    @Before
    public void setUp() {
        caixaEletronico = new CaixaEletronico();
        valorSacado.put(100, 0);
        valorSacado.put(50, 0);
        valorSacado.put(20, 0);
        valorSacado.put(10, 0);
    }

    @Test()
    public void sacar_valor_200() {
        int valorSaque = 200;
        valorSacado.put(100, 2);

        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_150() {
        int valorSaque = 150;
        valorSacado.put(100, 1);
        valorSacado.put(50, 1);
        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_100() {
        int valorSaque = 100;
        valorSacado.put(100, 1);
        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_50() {
        int valorSaque = 50;
        valorSacado.put(50, 1);
        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_20() {
        int valorSaque = 20;
        valorSacado.put(20, 1);
        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_10() {
        int valorSaque = 10;
        valorSacado.put(10, 1);
        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_180() {
        int valorSaque = 180;
        valorSacado.put(100, 1);
        valorSacado.put(50, 1);
        valorSacado.put(20, 1);
        valorSacado.put(10, 1);
        Assert.assertEquals(valorSacado, caixaEletronico.sacar(valorSaque));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sacar_envia_nota_0_indisponivel() {
        Integer valorSaque = new Integer(0);
        caixaEletronico.sacar(valorSaque);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sacar_valor_invalido() {
        Integer valorSaque = new Integer(13);
        caixaEletronico.sacar(valorSaque);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sacar_valor_negativo() {
        Integer valorSaque = new Integer(-1);
        caixaEletronico.sacar(valorSaque);
    }
}
