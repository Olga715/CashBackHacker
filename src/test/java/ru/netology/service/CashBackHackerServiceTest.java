package ru.netology.service;

public class CashBackHackerServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testPrevMaxRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testNextMinRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testMaxRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testPrevMinRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        org.junit.Assert.assertEquals(expected, actual);
    }
}

