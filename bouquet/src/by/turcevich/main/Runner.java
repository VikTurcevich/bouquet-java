package by.turcevich.main;

import by.turcevich.comparator.FreshLevelComparator;
import by.turcevich.flowers.*;
import by.turcevich.freshness.FreshnessLevel;
import by.turcevich.search.StemLengthSearch;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        FreshLevelComparator flComp = new FreshLevelComparator();
        String flowerToSearch;
        Flowers[] bouquet = new Flowers[5];
        int bouquetCost = 0;

        bouquet[0] = new Bluebells(15, FreshnessLevel.FullFresh, 70);
        bouquet[1] = new Chrysanthemums(8, FreshnessLevel.MiddleFresh, 30);
        bouquet[2] = new Lilies(29, FreshnessLevel.OldFresh, 100);
        bouquet[3] = new Roses(49, FreshnessLevel.FullFresh, 160);
        bouquet[4] = new Tulips(19, FreshnessLevel.OldFresh, 50);

        Arrays.sort(bouquet, flComp);

        for (Flowers flowers : bouquet) {
            bouquetCost += flowers.getCost();
            System.out.println(flowers);
        }

        System.out.println("\nFull price of the bouquet: " + bouquetCost + "$");

        flowerToSearch = StemLengthSearch.stemLengthSearch(bouquet, 50, 150);
        if (flowerToSearch.equals("")) {
            System.out.println("\nA flowers corresponding to a range of stem lengths: not found.");
        } else {
            System.out.println("\nA flowers corresponding to a range of stem lengths: \n" + flowerToSearch);
        }
    }
}
