package com.pb.enot.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

class Phones {
    public String type;
    public String number;

    public Phones(String type, String number) {
        this.type = type;
        this.number = number;
    }
}
public class PhoneBook {
    public  String Numbers;
    public String fullName;
    public LocalDate dateOfBirth;
    public List<Phones> phoneNumbers;
    public String streetAddress;
    public LocalDateTime modifyDate;

    public PhoneBook() {
    }
    public PhoneBook(String fullName, String Numbers, LocalDate dateOfBirth, String streetAddress) {
        this.fullName = fullName;
        this.Numbers = Numbers;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.modifyDate = LocalDateTime.now();





    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", phone='" + phoneNumbers + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

}





