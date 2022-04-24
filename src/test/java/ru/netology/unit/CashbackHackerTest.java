package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {

    CashbackHacker service = new CashbackHacker();

    @Test
    public void coastBelowLimit() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void bonusEqualLimit() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void maxBonus() {
        int amount = 1920;

        int actual = service.remain(amount);
        int expected = 80;

        assertEquals(expected, actual);
    }
}