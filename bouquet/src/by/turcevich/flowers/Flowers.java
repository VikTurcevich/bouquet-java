package by.turcevich.flowers;

import by.turcevich.freshness.FreshnessLevel;

public abstract class Flowers{
    private String name;
    protected int cost;
    protected FreshnessLevel fresh;
    protected int stemLength;

    public Flowers(int cost, FreshnessLevel fresh, int stemLength) {
        this.fresh = fresh;
        this.stemLength = stemLength;
        switch (this.fresh) {
            case FullFresh -> this.cost = cost;
            case MiddleFresh -> this.cost = (int)Math.round(0.75 * cost);
            case OldFresh -> this.cost = (int)Math.round(0.5 * cost);
        }
    }

    @Override
    public String toString () {
        return "cost: " + cost + ", freshness: " + fresh + ", stem length: " + stemLength;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public FreshnessLevel getFresh() {
        return fresh;
    }

    public void setFresh(FreshnessLevel fresh) {
        this.fresh = fresh;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }
}
