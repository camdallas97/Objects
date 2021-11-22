import java.util.Scanner;

public class MainProgram
{
    public static void main (String [] args)
    {
        //initialised the scanner for the user input for each class
        Scanner sc = new Scanner(System.in);

        //prompted the user with a series of questions for the project that would store the answer in a variable
        System.out.println("Enter the project number: ");
        int projectNum = sc.nextInt();
        //wherever a nextInt followed a nextLine the line below had to be inserted to put the cursor on a new line so
        //as not to throw errors when storing the input
        sc.nextLine();
        //the same logic follows for each other question
        System.out.println("Enter the project name: ");
        String projectName = sc.nextLine();
        System.out.println("Enter the building type: ");
        String building = sc.nextLine();
        System.out.println("Enter the project address: ");
        String projectAddress = sc.nextLine();
        System.out.println("Enter the ERF number: ");
        int erf = sc.nextInt();
        System.out.println("Enter the total fee: ");
        long totalFee = sc.nextLong();
        System.out.println("Enter the amount paid to date: ");
        long currentFee = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the deadline: ");
        String deadline = sc.nextLine();
        System.out.println();

        //the same logic follows for prompting the user with questions about the architect
        System.out.println("Enter the architect's name: ");
        String arc_name = sc.nextLine();
        System.out.println("Enter the architect's number: ");
        int arc_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the architect's email address: ");
        String arc_email = sc.nextLine();
        System.out.println("Enter the architect's home address: ");
        String arc_address = sc.nextLine();
        System.out.println();

        //the same logic follows for prompting the user with questions about the customer
        System.out.println("Enter the customer's name: ");
        String cust_name = sc.nextLine();
        System.out.println("Enter the customer's number: ");
        int cust_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the customer's email  address: ");
        String cust_email = sc.nextLine();
        System.out.println("Enter the customer's home address: ");
        String cust_address = sc.nextLine();
        System.out.println();

        //the same logic follows for prompting the user with questions about the contractor
        System.out.println("Enter the contractor's name: ");
        String con_name = sc.nextLine();
        System.out.println("Enter the contractor's number: ");
        int con_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the contractor's email address: ");
        String con_email = sc.nextLine();
        System.out.println("Enter the  ontractor's home address: ");
        String con_address = sc.nextLine();

        //the values that will be assigned to the constructor will be the user input variables in order of initialisation
        Project first = new Project(projectNum, projectName, building, projectAddress, erf, totalFee, currentFee,
                                    deadline);
        Architect Jacob = new Architect(arc_name, arc_number, arc_email, arc_address);
        Customer Fred = new Customer(cust_name, cust_number, cust_email, cust_address);
        Contractor Helena = new Contractor(con_name, con_number, con_email,con_address);

        System.out.println("\nProjects");
        System.out.println(first);

        System.out.println("\nArchitects");
        System.out.println(Jacob);

        System.out.println("\nCustomers");
        System.out.println(Fred);

        System.out.println("\nContractors");
        System.out.println(Helena);
    }
}
