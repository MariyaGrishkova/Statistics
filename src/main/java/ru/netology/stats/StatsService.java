package ru.netology.stats;

public class StatsService<purchases> {

    private int[] purchases;

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
        this.purchases = purchases;
        int max = 0;
        for (int purchase : purchases) {
            max = purchases[0];
            if (purchase > max) {
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

}
