package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int medianSumSales(int[] sales) {

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int median = sum / sales.length;
        return median;

    }

    public int minSales(int[] sales) {

        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int volumeMonthSalesLowerMedian(int[] sales) {

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int median = sum / sales.length;

        int volMonth = 0;

        for (int sale : sales) {

            if (median < sale)
                volMonth++;
        }

        return volMonth;

    }

    public int volumeMonthSalesHigherMedian(int[] sales) {

        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int median = sum / sales.length;

        int volMonth = 0;

        for (int sale : sales) {

            if (median > sale)
                volMonth++;
        }

        return volMonth;

    }

}
