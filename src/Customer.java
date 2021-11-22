public class Customer
{
    //initialised my attributes for my class
    String name;
    long number;
    String email;
    String address;

    //initialised the constructor
    public Customer (String name, long number, String email, String address)
    {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }
    //initialised the toString method to display the contents of each variable
    public String toString()
    {
        String output = "";
        output += "\nName: " + name;
        output += "\nNumber: " + number;
        output += "\nEmail: " + email;
        output += "\nAddress: " + address;

        return output;
    }
}
