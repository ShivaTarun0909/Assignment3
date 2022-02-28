package Assignment3;

public class Case1 {

    public  String  FirstName;
    public String   LastName;
    public String PhoneNumber;
    public String  Email;
    public String  Address;
    public  String State;
    public  String Country;


    public Case1(String firstName, String lastName, String phoneNumber, String email, String address, String state, String country) {
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
        Email = email;
        Address = address;
        State = state;
        Country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
