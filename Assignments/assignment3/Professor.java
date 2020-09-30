package assignment3;


public class Professor {
    private String firstName;
    private String lastName;
    private String id;

    public static class Builder {
        private String firstName;
        private String lastName;
        private String id;

        Builder(String firstName, String lastName, String id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }
    }
}
