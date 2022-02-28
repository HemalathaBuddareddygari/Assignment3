package java3.com;

import com.sun.javafx.UnmodifiableArrayList;
import com.sun.javafx.fxml.expression.KeyPath;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mainuser {
    public  String  FirstName;
    public String   LastName;

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
    public static String  Email;
    public String  Address;
    public  String State;
    public  String Country;


    public static void main(String[] args) {
       List<User> list
                = Arrays.asList(new User("hema", "latha", "60089900", "hema505@gmail.com", "atp", "ap", "India"),
                (new User("Nithin", "Reddy", "970420788", "reddy678@gmail.com", "hyd", "ap", "India")),
                (new User("Nani", "naturalstar", "868893994", "nani987@gmail.com", "karnataka", "ap", "India")),
                (new User("Ranbir", "kapoor", "630303794", "ranbir50578@gmail.com", "udipi", "ap", "India")),
                (new User("Alia", "Bhatt", "970482893", "Alia56767@gmail.com", "hasan", "", "India")),
                (new User("hari", "chinna", "630008325", "hema@505", "yelahanka", "Karnataka", "India")),
                (new User("honey", "singh", "900083255", "hema@505", "magestic", "Andhra", "India")),
                (new User("shruthi", "hasan", "800083255", "hema@505", "Sivajinagar", "telangana", "India")),
                (new User("krishna", "malina", "700083255", "hema@505", "chikpet", "kerala", "India")),
                (new User("abi", "ram", "980083255", "hema@505", "atp", "Ap", "India")));

        //System.out.println("user details=" + list);

      //  String searcElement = null;
      //  System.out.println("Enter the email to search");
     //   Scanner sc = new Scanner(System.in);
     //  String searchElement = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter phonenumber");
        String phonenumber1 = sc1.nextLine();

        for (User i:list)
        {
            if(phonenumber1.equals(i.PhoneNumber))
            {
                System.out.println("user details="+i.FirstName  +i.LastName +i.Address +i.Country +i.State);
            }
        }

       /* if (searchElement == null) {
            System.out.println("You haven't entered an email");
            return;
        }
       // KeyPath Email = null;
        for(int i = 0; i<Email.length(); i++) {

          //  System.out.println(Email.getBytes(StandardCharsets.UTF_8));

     //       if(searcElement==Email.toString()) {

                System.out.println("\n");

                System.out.println("email ID" + searcElement + "found");

                break;
                */

            }
        }




