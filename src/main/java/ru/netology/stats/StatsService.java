package ru.netology.stats;

import static java.util.Arrays.*;

public class StatsService {
    public int totalAmountSales(int[] sales) {

        return stream(sales).sum();
    }

    public int averageSalesPerMonth(int[] sales) {
        return stream(sales).sum() / 12;
    }

    public int monthWithMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthWithMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountMonthsBelowAverageSales(int[] sales) {
        int amountMonths = 0;
        int averageSalesPerMonth = averageSalesPerMonth(sales);
        for (int t : sales) {
            if (t < averageSalesPerMonth) {
                amountMonths++;
            }
        }
        return amountMonths;


    }

    public int amountMonthsAboveAverageSales(int[] sales) {
        int amountMonths = 0;
        int averageSalesPerMonth = averageSalesPerMonth(sales);
        for (int t : sales) {
            if (t > averageSalesPerMonth) {
                amountMonths++;
            }
        }
        return amountMonths;
    }

}
