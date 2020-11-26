package ru.netology.stats;

public class StatsService<purchases> {

    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }

        return result;

    }

    public int average(int[] purchases) {
        int sum = sum(purchases);

        return sum / purchases.length;
    }

    public int MaxMonth(int[] purchases) {
        int max = purchases [0];
        for (int purchase : purchases) {
            max = purchases[0];
            if (purchase >= max) {
                max = purchase;
            }
        }
        int monthNumber = 0;
        int maxMonth = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == max) {
                maxMonth = monthNumber;
            }
        }
        return maxMonth;
    }
    public int MinMonth(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            min = purchases[0];
            if (purchase < min) {
                min = purchase;
            }
        }
        int monthNumber = 0;
        int minMonth = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == min) {
                minMonth = monthNumber;
            }
        }
        return minMonth;
    }
}

