import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        /*String name;
        int hours;
        double payRate;
        double grossPay;

        //Create a Scanner object to read input
        Scanner read = new Scanner(System.in);

        //Get the user's name
        System.out.println("What is your name?");
        name = read.nextLine();

        //Get the numgiza
        // ber of hours worked
        System.out.println("How many hours did you work?");
        hours = read.nextInt();

        //Get the user's hourly rate
        System.out.println("What is your hourly pay rate?");
        payRate = read.nextDouble();

        //Calculate the gross pay
        grossPay = hours * payRate;

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);

        //Bugaboo #1
        int age;
        String name;

        System.out.println("What is your age?");
        age = read.nextInt();

        System.out.println("what is your name")
        name = read.nextInt();

        System.out.println("Hello " + name + ", you are " + age + "years old!");*/

        // Bugaboo #2
        String firstName;
        String lastName;

        System.out.println("what is you full name with age?");
        firstName = read.nextLine();
        lastName = read.next();
        String age = read.nextLine();
        System.out.println("hello, " + firstName + " " +lastName + "you are " + age + "years old,");
    }
}
