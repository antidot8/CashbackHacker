package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void calculateIfAmountLess1000() {
        int amount = 800;
        int expected = cashbackHackService.remain(amount);
        assertEquals(200, expected);
    }

    @Test
    public void calculateIfAmountMore1000() {
        int amount = 1100;
        int expected = cashbackHackService.remain(amount);
        assertEquals(900, expected);
    }

    @Test //этот тест падает
    public void calculateIfAmountIs1000() {
        int amount = 1000;
        int expected = cashbackHackService.remain(amount);
        assertEquals(0, expected);
    }

    @Test
    public void calculateIfAmountIs0() {
        int amount = 0;
        int expected = cashbackHackService.remain(amount);
        assertEquals(1000, expected);
    }
}