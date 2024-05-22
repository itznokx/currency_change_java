package com.currencychanger.app;

import CurrencyHeader.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
		System.out.println(CurrencyHeader.currencyConverter("EUR",10.0,"BRL"));
    }
}
