package by.turcevich.search;

import by.turcevich.flowers.Flowers;

public class StemLengthSearch {
    public static String stemLengthSearch (Flowers[] arr, int start, int end) {
        String st = "";
        for (Flowers flowers : arr) {
            if (flowers.getStemLength() >= start && flowers.getStemLength() <= end)
                st += flowers + "\n";
        }
        return st;
    }
}
