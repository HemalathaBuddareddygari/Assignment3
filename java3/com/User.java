package java3.com;

public class User {

 public  String  FirstName;
  public String   LastName;
  public String PhoneNumber;
    public String  Email;
   public String  Address;
 public  String State;
 public  String Country;


   public User(String firstName, String lastName, String phoneNumber, String email, String address, String state, String country) {
      FirstName = firstName;
      LastName = lastName;
      PhoneNumber = phoneNumber;
      Email = email;
      Address = address;
      State = state;
      Country = country;
   }
/*
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

   public int getPhoneNumber() {
      return PhoneNumber;
   }

   public void setPhoneNumber(int phoneNumber) {
      PhoneNumber = phoneNumber;
   }

   public String getEmail() {
      return Email;
   }

   public void setEmail(String email) {
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
*/
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
