package by.turcevich.flowers;

import by.turcevich.freshness.FreshnessLevel;

public class Tulips extends Flowers{
    public Tulips(int cost, FreshnessLevel fresh, int stemLength) {
        super(cost, fresh, stemLength);
    }

    @Override
    public String toString () {
        return "Tulip: " + "Cost " + cost + "$, " + fresh + ", Stem length " + stemLength + "cm.";
    }
}
