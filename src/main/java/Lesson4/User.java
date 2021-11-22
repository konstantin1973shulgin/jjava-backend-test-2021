package Lesson4;

public class User {

    private final String name;
    private final String surname;
    private final String addres;
    private final String email;
    private final String phone;
    private final String vkLinr;
    private final String facebookLink;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.addres = builder.addres;
        this.email = builder.email;
        this.phone = builder.phone;
        this.vkLinr = builder.vkLinr;
        this.facebookLink = builder.facebookLink;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddres() {
        return addres;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getVkLinr() {
        return vkLinr;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public static UserBuilder builder() {
        return new UserBuilder();

    }
    public static class UserBuilder {

        private String name;
        private String surname;
        private String addres;
        private String email;
        private String phone;
        private String vkLinr;
        private String facebookLink;

        public UserBuilder withName(String name) {
            this.name = name;
            return this;

        }

        public UserBuilder withSurname(String surname) {
            this.surname = surname;
            return this;

        }

        public UserBuilder withAddres(String addres) {
            this.addres = addres;
            return this;

        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;

        }

        public UserBuilder withPhone(String phone) {
            this.phone = phone;
            return this;

        }

        public UserBuilder withVkLinr(String vkLink) {
            this.vkLinr = vkLink;
            return this;

        }

        public UserBuilder withFacebookLink(String facebookLink) {
            this.facebookLink = facebookLink;
            return this;

        }

         public User build() {
            return new User(this);
         }

    }


}

