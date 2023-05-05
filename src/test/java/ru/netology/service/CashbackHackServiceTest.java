package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountIf1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        int actual = service.remain(3700);
        Assertions.assertEquals(expected, actual);
    }

}