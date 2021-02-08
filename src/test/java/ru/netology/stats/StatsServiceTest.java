package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSum() {

        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAverage() {

        int expected = 15;
        int actual = service.average(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthMax() {

        int expected = 8;
        int actual = service.monthMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthMin() {

        int expected = 9;
        int actual = service.monthMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMoreAverage() {

        int expected = 5;
        int actual = service.monthCountMoreAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnLessAverage() {

        int expected = 5;
        int actual = service.monthCountLessAverage(purchases);
        assertEquals(expected, actual);
    }
}

