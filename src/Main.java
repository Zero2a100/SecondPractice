import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Enter Name");
        String myName = keyboard.next();
        //System.out.println("Enter last name");
        //String lastName = keyboard.next();
        //System.out.println("Enter address");
        //String myAddress = keyboard.next();
        //System.out.println("My name is " + myName + " " + lastName + " and my address is " + myAddress);
        for (int i = 0; i <= myName.length() - 1; i++) {
            System.out.println(myName.charAt(i));
            //for (int ;= myName.charAt(0); int <= myName.length())
        }
        System.out.println(myName.length());
    }
}