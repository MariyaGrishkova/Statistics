package ru.netology.stats;

import org.testng.annotations.Test;

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


}