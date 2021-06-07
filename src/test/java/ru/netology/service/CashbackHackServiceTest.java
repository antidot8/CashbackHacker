package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    void calculateIfAmountLess1000() {
        int amount = 800;
        assertEquals(200, cashbackHackService.remain(amount));
    }

    @Test
    void calculateIfAmountMore1000() {
        int amount = 1100;
        assertEquals(900, cashbackHackService.remain(amount));
    }

    @Test //этот тест падает
    void calculateIfAmountIs1000() {
        int amount = 1000;
        assertEquals(0, cashbackHackService.remain(amount));
    }

    @Test
    void calculateIfAmountIs0() {
        int amount = 0;
        assertEquals(1000, cashbackHackService.remain(amount));
    }
}