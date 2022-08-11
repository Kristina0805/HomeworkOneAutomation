package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1480;

        int expected = 520;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainTwo() {

        CashbackHackService service = new CashbackHackService();

        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}