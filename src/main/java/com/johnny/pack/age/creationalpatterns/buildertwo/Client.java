package com.johnny.pack.age.creationalpatterns.buildertwo;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        UserDTO dto = directBuild(UserDTO.getBuilder(), createUser());
        System.out.println(dto);
    }

    // Director
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     * Returns a sample user
     */
    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        user.setAddress(createAddress());
        return user;
    }

    public static Address createAddress(){
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipCode("47998");
        return address;
    }
}
