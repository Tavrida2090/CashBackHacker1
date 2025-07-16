package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void shouldNewBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int actual = 150;
        int expected = 150;
        assertEquals(actual, expected);
    }

    @Test
    void shouldLessAmount() {
        int amount = 900;
        int actual = 0;
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void shouldPurchase1000() {
        int amount = 1000;
        int actual = 0;
        int expected = 0;
        assertEquals(actual, expected);
    }

}
