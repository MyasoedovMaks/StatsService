package ru.netology.stats;


import javax.swing.*;

public class StatsService {

    public long sum (long[] sales) {
        long result = 0;
        for (int i = 0; i < sales.length; i++) {
          result += sales [i];

        }
        return result;
    }

    public long average (long[] sales) {
        return sum(sales) / sales.length;

    }

    public int maximum(long[] sales) {
        int maximumMouth = 0;
        long maximumSale = sales [0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = sales [i];
                maximumMouth = i;
            }
        }
        return maximumMouth + 1;
    }

    public int minMum(long[] sales) {
        int minimumMouth = 0;
        long minimumSale = sales [0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumSale = sales [i];
                minimumMouth = i;
            }
        }
        return minimumMouth ;
    }

    public int belowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
            
        }
        return counter;

    }

    public int aboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;

    }
}
