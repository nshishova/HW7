package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calTotalAmountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedTotal = 180;
        int actualTotal = service.totalAmountSales(sales);
        Assertions.assertEquals(expectedTotal, actualTotal);

    }

    @Test
    public void calAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSalesPerMonth(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.monthWithMaxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.monthWithMinSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void amountMonthBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountMonth = 5;
        int actualAmountMonth = service.amountMonthsBelowAverageSales(sales);
        Assertions.assertEquals(expectedAmountMonth, actualAmountMonth);

    }

    @Test
    public void amountMonthAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountMonth = 5;
        int actualAmountMonth = service.amountMonthsAboveAverageSales(sales);
        Assertions.assertEquals(expectedAmountMonth, actualAmountMonth);

    }
}
