package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    void calculateIfAmountLess1000() {
        int amount = 800;
        int expected = cashbackHackService.remain(amount);
        assertEquals(200, expected);
    }

    @Test
    void calculateIfAmountMore1000() {
        int amount = 1100;
        int expected = cashbackHackService.remain(amount);
        assertEquals(900, expected);
    }

    @Test //этот тест падает
    void calculateIfAmountIs1000() {
        int amount = 1000;
        int expected = cashbackHackService.remain(amount);
        assertEquals(0, expected);
    }

    @Test
    void calculateIfAmountIs0() {
        int amount = 0;
        int expected = cashbackHackService.remain(amount);
        assertEquals(1000, expected);
    }
}