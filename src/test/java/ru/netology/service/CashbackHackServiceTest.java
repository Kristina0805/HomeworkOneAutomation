package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void testRemainTwo() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void remain() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1480;

        int expected = 520;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remainTwo() {

        CashbackHackService service = new CashbackHackService();

        int amount = 2000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
}