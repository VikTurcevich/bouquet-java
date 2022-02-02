package by.turcevich.flowers;

import by.turcevich.freshness.FreshnessLevel;

public class Chrysanthemums extends Flowers{
    public Chrysanthemums(int cost, FreshnessLevel fresh, int stemLength) {
        super(cost, fresh, stemLength);
    }

    @Override
    public String toString () {
        return "Chrysanthemum: " + "Cost " + cost + "$, " + fresh + ", Stem length " + stemLength + "cm.";
    }
}
