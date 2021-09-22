package com.github.dojo.caixaeletronico;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

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
    public void sacar_valor_10(){
        BigDecimal valorSaque = new BigDecimal(10);
       Assert.assertEquals(10,  caixaEletronico.sacar(valorSaque));

    }    

    // @Test
    // public void sacar_sucesso() {
    //     BigDecimal valorSaque = new BigDecimal(30);
    //     List<Integer> notas = caixaEletronico.sacar(valorSaque);


        
    //     assertEquals(valorSaque, );
    //     assertEquals(1, notas.qtdDez);
    //     assertEquals(0, notas.qtdCinquenta);
    //     assertEquals(0, notas.qtdCem);
    // }

    // @Test
    // public void sacar_envia_nota_5_indisponivel(){

    //     BigDecimal valorSaque = new BigDecimal(5);

    //     assertFalse((valorSaque % 10 == 0));
    // }

    // @Test
    // public void sacar_envia_nota_25_indisponivel(){

    //     BigDecimal valorSaque = new BigDecimal(25);

    //     assertFalse((valorSaque % 10 == 0));
    // }   

    // @Test
    // public void sacar_envia_nota_212_indisponivel(){

    //     BigDecimal valorSaque = new BigDecimal(212);

    //     assertFalse((valorSaque % 10 == 0));
    // } 

    @Test(expected = IllegalArgumentException.class)
    public void sacar_envia_nota_0_indisponivel(){
        BigDecimal valorSaque = new BigDecimal(0);
        caixaEletronico.sacar(valorSaque);
    }          

    @Test(expected = IllegalArgumentException.class)
    public void sacar_valor_decimal(){
        BigDecimal valorSaque = new BigDecimal(1.20);
        caixaEletronico.sacar(valorSaque);
    }          

    @Test(expected = IllegalArgumentException.class)
    public void sacar_valor_negativo(){
        BigDecimal valorSaque = new BigDecimal(-1);
        caixaEletronico.sacar(valorSaque);
    }    

}
