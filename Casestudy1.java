package Assignment3;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Casestudy1 {

        public String FirstName;
        public String LastName;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public static String getEmail() {
            return Email;
        }

        public static void setEmail(String email) {
            Email = email;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public String PhoneNumber;
        public static String Email;
        public String Address;
        public String State;
        public String Country;


        public static void main(String[] args) {
            List<Case1> list
                    = Arrays.asList(new Case1("akhila", "veeramalla", "7993325395", "akhila1@gmail.com", "atp", "ts", "India"),
                    (new Case1("sai", "priya", "9248146448", "priya@gmail.com", "hyd", "ap", "India")),
                    (new Case1("spandana", "alampally", "9248046448", "spandana@gmail.com", "karnataka", "ap", "India")),
                    (new Case1("Ranbir", "kapoor", "630303794", "ranbir50578@gmail.com", "udipi", "ap", "India")),
                    (new Case1("Alia", "Bhatt", "970482893", "Alia56767@gmail.com", "hasan", "", "India")),
                    (new Case1("sai", "krishna", "9948604287", "sai505@gmail.com", "yelahanka", "Karnataka", "India")),
                    (new Case1("shiva", "tharun", "8074265211", "shiva@gmail.com", "magestic", "Andhra", "India")),
                    (new Case1("ayan", "mukheed", "9866148197", "ayan@gmail.com", "Sivajinagar", "telangana", "India")),
                    (new Case1("sruthi", "reddy", "8639327298", "sruthi@gmail.com", "chikpet", "kerala", "India")),
                    (new Case1("abi", "ram", "980083255", "hema@505", "atp", "Ap", "India")));

            //System.out.println("Case1 details=" + list);

            //  String searcElement = null;
            //  System.out.println("Enter the email to search");
            //   Scanner sc = new Scanner(System.in);
            //  String searchElement = sc.nextLine();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter phonenumber");
            String phonenumber1 = sc1.nextLine();

            for (Case1 i : list) {
                if (phonenumber1.equals(i.PhoneNumber)) {
                    System.out.println("Case1 details=" + i.FirstName + i.LastName + i.Address + i.Country + i.State);
                }
            }


        }
    }
