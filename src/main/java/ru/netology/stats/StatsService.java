package ru.netology.stats;

public class StatsService {


    public int sum(int[] purchases) {

        int result = 0;
        for (int purchase : purchases) {
            result = result + purchase;
        }

        return result;
    }

    public int average(int[] purchases) {

        int sum = sum(purchases);
        int result = sum / purchases.length;

        return result;

    }

    public int monthMax(int[] purchases) {
        int month = 0;
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        int monthMax = 0;
        int monthCount = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthMax = monthCount;
            }
        }
        return monthMax;

    }

    public int monthMin(int[] purchases) {
        int month = 0;
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        int monthMin = 0;
        int monthCount = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                monthMin = monthCount;
            }
        }
        return monthMin;
    }

    public int monthCountMoreAverage(int[] purchases) {

        int average = average(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                monthCount++;
            }
        }
        return monthCount;
    }


    public int monthCountLessAverage(int[] purchases) {
        int average = average(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

}

