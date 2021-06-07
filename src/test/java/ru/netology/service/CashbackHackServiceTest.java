package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void calculateIfAmountLess1000() {
        int amount = 800;
        assertEquals(200, cashbackHackService.remain(amount));
    }

    @Test
    public void calculateIfAmountMore1000() {
        int amount = 1100;
        assertEquals(900, cashbackHackService.remain(amount));
    }

    @Test //этот тест падает
    public void calculateIfAmountIs1000() {
        int amount = 1000;
        assertEquals(0, cashbackHackService.remain(amount));
    }

    @Test
    public void calculateIfAmountIs0() {
        int amount = 0;
        assertEquals(1000, cashbackHackService.remain(amount));
    }
}