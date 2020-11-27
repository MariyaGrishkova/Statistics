package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldSum() {
        StatsService service = new StatsService();
        int [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals (expected, actual);
    }
    @Test
    void shouldAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.average(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnMaxMonth (){
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMax(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnMinMonth () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.GetMin(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnBadMonth (){
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual =service.BadMonth(purchases);
    }
    @Test
    void shouldReturnGoodMonth () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.GoodMonth(purchases);
    }
}