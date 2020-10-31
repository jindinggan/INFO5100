package assignment6.partA;

import java.util.*;


public class Mreview implements Comparable<Mreview> {
    private ArrayList<Integer> ratings;
    private String title;

    Mreview() {
        title = "";
        ratings = new ArrayList<>();
    }

    Mreview(String ttl) {
        title = ttl;
        ratings = new ArrayList<>();
    }

    Mreview(String ttl, int firstRating) {
        title = ttl;
        ratings = new ArrayList<>();
        ratings.add(firstRating);
    }

    public void addRating(int r) {
        ratings.add(r);
    }

    public String getTitle() {
        return title;
    }

    public int numRatings() {
        return ratings.size();
    }

    public double aveRating() {
        double sum = 0;
        for (int k : ratings) {
            sum += k;
        }
        double round = Math.round((sum / ratings.size()) * 100.0) / 100.0;
        return round;
    }

    @Override
    public int compareTo(Mreview o) {
        String str1 = this.title;
        String str2 = o.getTitle();
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            int k = str1.charAt(i) - str2.charAt(i);
            if (k > 0) {
                return -1;
            } else if (k < 0) {
                return 1;
            }
        }
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.compareTo((Mreview) obj) == 0;
    }

    @Override
    public String toString() {
        return this.title + ", average " + this.aveRating() + " out of " + this.numRatings() + " ratings";
    }
}
