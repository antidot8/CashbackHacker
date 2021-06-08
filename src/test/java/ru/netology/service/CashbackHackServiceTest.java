package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    void calculateIfAmountLess1000() {
        int amount = 800;
        assertEquals(cashbackHackService.remain(amount), 200);
    }

    @Test
    void calculateIfAmountMore1000() {
        int amount = 1100;
        assertEquals(cashbackHackService.remain(amount), 900);
    }

    @Test //этот тест падает
    void calculateIfAmountIs1000() {
        int amount = 1000;
        assertEquals(cashbackHackService.remain(amount), 0);
    }

    @Test
    void calculateIfAmountIs0() {
        int amount = 0;
        assertEquals(cashbackHackService.remain(amount), 1000);
    }
}