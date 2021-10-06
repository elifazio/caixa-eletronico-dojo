package com.github.dojo.caixaeletronico;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

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

    @Before
    public void setUp() {
        caixaEletronico = new CaixaEletronico();
    }

    @Test()
    public void sacar_valor_200() {
        int valorSaque = 200;
        Assert.assertArrayEquals(new Integer[] { 2, 0, 0, 0 }, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_150() {
        int valorSaque = 150;
        Assert.assertArrayEquals(new Integer[] { 1, 1, 0, 0 }, caixaEletronico.sacar(valorSaque));
    }    
// criar um cenario de testes com todas as notas no retorno
// refatorar para melhorar o algoritmo...
    @Test()
    public void sacar_valor_100() {
        int valorSaque = 100;
        Assert.assertArrayEquals(new Integer[] { 1, 0, 0, 0 }, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_50() {
        int valorSaque = 50;
        Assert.assertArrayEquals(new Integer[] { 0, 1, 0, 0 }, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_20() {
        int valorSaque = 20;
        Assert.assertArrayEquals(new Integer[] { 0, 0, 1, 0 }, caixaEletronico.sacar(valorSaque));
    }

    @Test()
    public void sacar_valor_10() {
        int valorSaque = 10;
        Assert.assertArrayEquals(new Integer[] { 0, 0, 0, 1 }, caixaEletronico.sacar(valorSaque));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sacar_envia_nota_0_indisponivel() {
        Integer valorSaque = new Integer(0);
        caixaEletronico.sacar(valorSaque);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sacar_valor_invalido() {
        Integer valorSaque = new Integer(1);
        caixaEletronico.sacar(valorSaque);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sacar_valor_negativo() {
        Integer valorSaque = new Integer(-1);
        caixaEletronico.sacar(valorSaque);
    }

    // @Test()
    // public void sacar_valor_10(){
    // int valorSaque = 10;

    // // Assert.assertEquals(10, caixaEletronico.sacar(valorSaque));

    // }

    // @Test
    // public void sacar_sucesso() {
    // BigDecimal valorSaque = new BigDecimal(30);
    // List<Integer> notas = caixaEletronico.sacar(valorSaque);

    // assertEquals(valorSaque, );
    // assertEquals(1, notas.qtdDez);
    // assertEquals(0, notas.qtdCinquenta);
    // assertEquals(0, notas.qtdCem);
    // }

    // @Test
    // public void sacar_envia_nota_5_indisponivel(){

    // BigDecimal valorSaque = new BigDecimal(5);

    // assertFalse((valorSaque % 10 == 0));
    // }

    // @Test
    // public void sacar_envia_nota_25_indisponivel(){

    // BigDecimal valorSaque = new BigDecimal(25);

    // assertFalse((valorSaque % 10 == 0));
    // }

    // @Test
    // public void sacar_envia_nota_212_indisponivel(){

    // BigDecimal valorSaque = new BigDecimal(212);

    // assertFalse((valorSaque % 10 == 0));
    // }

}
