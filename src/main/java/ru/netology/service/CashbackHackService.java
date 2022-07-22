package ru.netology.service;


public class CashbackHackService {

    private final int boundary = 1000;   // boundary - граница

    public int remain(int amount) {       // amount - сумма
        return boundary - amount % boundary;
    }
}
