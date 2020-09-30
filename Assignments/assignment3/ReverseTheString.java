package assignment3;

public class ReverseTheString {
    public String reverse(String s) {
        s = s.strip();
        String[] list = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            result.append(list[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
