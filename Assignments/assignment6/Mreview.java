package assignment6;

import java.util.ArrayList;
import java.util.Iterator;

public class Mreview implements Comparable<Mreview>{
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
        
    }
    @Override
    public int compareTo(Mreview o) {
        return 0;
    }
}
