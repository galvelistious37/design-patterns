package com.johnny.pack.age.creationalpatterns.buildertwo;

import java.time.LocalDate;
import java.time.Period;

// Product class
public class UserDTO {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "name=" + name
                + "\nage=" + age
                + "\naddress=" + address;
    }

    // Get builder instance
    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }

    //Builder
    public static class UserDTOBuilder{
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", "
                    + address.getStreet() + "\n"
                    + address.getCity() + "\n"
                    + address.getState() + " "
                    + address.getZipCode();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName+ " " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return userDTO;
        }

        public UserDTO getUserDTO() {
            return userDTO;
        }
    }
}