import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       int age = 0;
       int favNum = 0; //Should be 1-10
       double salary = 0.0;
       String firstName = "";
       String lastName = "";
       String fullName = "";
       String trash = "";

        System.out.print("Enter your first name: ");
        firstName = in.nextLine();
        System.out.println("You said your first name is: " + firstName);

        System.out.print("Enter your last name: ");
        lastName = in.nextLine();
        System.out.println("You said your last name is: " + lastName);

        fullName = firstName + " " + lastName;
        System.out.println("Your full name is: " + fullName);

        System.out.print("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); //Clearing extra blank space
            System.out.println("You said your age is: " + age);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and do proper input.");
        }

        System.out.print("Enter your favorite number [1-10]: ");
        if(in.hasNextInt())
        {
            favNum = in.nextInt();
            in.nextLine(); //clears buffer
            if(favNum >= 1 && favNum <=10)
            {
                System.out.println("You said your favorite number is: " + favNum);
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and do proper input. Must be [1=10].");
        }

        System.out.println("Enter your salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); //Clear buffer

            System.out.println("You said your salary is: " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your salary is " + trash);
            System.out.println("Run the program again with correct input.");
        }


    }
}