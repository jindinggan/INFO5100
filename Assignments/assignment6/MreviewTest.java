package assignment6;

public class MreviewTest {
    public static void main(String[] args) {
        Mreview m1 = new Mreview("Kill Bill");
        Mreview m2 = new Mreview("Kill Gates");
        m1.addRating(3);
        m1.addRating(4);
        m1.addRating(3);
        m2.addRating(4);
        m2.addRating(5);
        m2.addRating(6);
        assert(m1.compareTo(m2) == -1);
        assert(!m1.equals(m2));
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
