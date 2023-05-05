package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJupiter {
    @org.junit.jupiter.api.Test
    public void shouldCalculateAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateAmountIf1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);
        Assert.assertEquals(expected, actual);
    }

}