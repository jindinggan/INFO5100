package assignment3;


public class Professor {
    // required parameters
    private String firstName;
    private String lastName;
    private String id;

    // optional parameters
    private int age;
    private String phone;
    private String address;
    private String email;

    public static class Builder {
        // required parameters
        private String firstName;
        private String lastName;
        private String id;

        // optional parameters
        private int age;
        private String phone;
        private String address;
        private String email;

        Builder(String firstName, String lastName, String id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Professor build() {
            return new Professor(this.firstName, this.lastName, this.id, this.age, this.phone, this.address,
                    this.email);
        }

    }

    public Professor(String firstName, String lastName, String id, int age, String phone, String address,
                     String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getId() {
        return this.id;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }
}
