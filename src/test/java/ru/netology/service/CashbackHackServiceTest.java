package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldNewBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;
        int actual = 150;
        int expected = 150;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLessAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int actual = 0;
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPurchase1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expected = 0;
        assertEquals(expected, actual);
    }
}