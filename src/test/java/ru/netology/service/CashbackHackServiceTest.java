package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateAmountIfMultipleOf1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);
        Assert.assertEquals(actual, expected);
    }
}