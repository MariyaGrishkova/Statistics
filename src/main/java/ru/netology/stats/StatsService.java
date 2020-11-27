package ru.netology.stats;

public class StatsService<purchases, count> {

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

    public int getMax(int[] purchases) {
        int monthMax = purchases[0];
        for (int purchase : purchases) {
            if (monthMax > purchase) {
                monthMax = purchase;
            }
        }
        return monthMax;
    }

    public int GetMin(int[] purchases) {
        int monthMin = purchases[0];
        for (int purchase : purchases) {
            if (monthMin < purchase) {
                monthMin = purchase;
            }
        }
        return monthMin;
    }

    public int BadMonth(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count++;

            }
        }

        return count;

    }

    public int GoodMonth(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;

            }
        }

        return count;
    }
}
