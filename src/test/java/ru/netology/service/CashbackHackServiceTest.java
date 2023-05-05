package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldCalculateAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateAmountIf1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);
        Assert.assertEquals(expected, actual);
    }

}