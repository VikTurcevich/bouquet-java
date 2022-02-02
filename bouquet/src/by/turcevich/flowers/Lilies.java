package by.turcevich.flowers;

import by.turcevich.freshness.FreshnessLevel;

public class Lilies extends Flowers{
    public Lilies(int cost, FreshnessLevel fresh, int stemLength) {
        super(cost, fresh, stemLength);
    }

    @Override
    public String toString () {
        return "Lilie: " + "cost " + cost + "$, " + fresh + ", stem length " + stemLength + "cm.";
    }
}
