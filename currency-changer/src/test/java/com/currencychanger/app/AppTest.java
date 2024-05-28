package com.currencychanger.app;

import java.util.*;
import java.util.Iterator;
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
		 //Put the tests here (see Junit.Test documentation)
		Set<Currency> test = CurrencyHeader.getCurrencies();
		System.out.println("Test end.");
    }
}
