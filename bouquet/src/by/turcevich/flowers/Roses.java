package by.turcevich.flowers;

import by.turcevich.freshness.FreshnessLevel;

public class Roses extends Flowers{
    public Roses(int cost, FreshnessLevel fresh, int stemLength) {
        super(cost, fresh, stemLength);
    }

    @Override
    public String toString () {
        return "Rose: " + "Cost " + cost + "$, " + fresh + ", Stem length " + stemLength + "cm.";
    }


}
