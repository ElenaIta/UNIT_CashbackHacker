package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    CashbackHacker service = new CashbackHacker();

    @Test
    public void coastBelowLimit() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void bonusEqualLimit() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void maxBonus() {
        int amount = 1820;

        int actual = service.remain(amount);
        int expected = 180;

        assertEquals(actual, expected);
    }
}