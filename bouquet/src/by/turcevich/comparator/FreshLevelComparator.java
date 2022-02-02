package by.turcevich.comparator;

import by.turcevich.flowers.Flowers;

import java.util.Comparator;

public class FreshLevelComparator implements Comparator<Flowers> {

    @Override
    public int compare(Flowers o1, Flowers o2) {
        return o1.getFresh().compareTo(o2.getFresh());
    }
}
