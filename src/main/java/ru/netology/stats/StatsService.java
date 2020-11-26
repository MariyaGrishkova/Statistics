package ru.netology.stats;

public class StatsService {

    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }

        return result;

    }
    public int average(int[] purchases){
        int sum = sum (purchases);

        return sum / purchases.length;
    }
}
