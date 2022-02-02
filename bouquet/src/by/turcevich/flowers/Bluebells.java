package by.turcevich.flowers;

import by.turcevich.freshness.FreshnessLevel;

public class Bluebells extends Flowers{

    public Bluebells(int cost, FreshnessLevel fresh, int stemLength) {
        super(cost, fresh, stemLength);
    }

    @Override
    public String toString () {
        return "Bluebell: " + "Cost " + cost + "$, " + fresh + ", Stem length " + stemLength + "cm.";
    }
}
