public class Project
{
    //initialised my attributes for my class
    int projectNum;
    String projectName;
    String building;
    String projectAddress;
    int erf;
    long totalFee;
    long currentFee;
    String deadline;

    //initialised the constructor
    public Project (int projectNum, String projectName, String building, String projectAddress, int erf, long totalFee,
                    long currentFee, String deadline)
    {
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.building = building;
        this.projectAddress = projectAddress;
        this.erf = erf;
        this.totalFee = totalFee;
        this.currentFee = currentFee;
        this.deadline = deadline;
    }
    //initialised the toString method to display the contents of each variable
    public String toString ()
    {
        String output = "";
        output += "\nProject Number: " + projectNum;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + building;
        output += "\nAddress: " + projectAddress;
        output += "\nERF Number: " + erf;
        output += "\nTotal Fee: " + totalFee;
        output += "\nAmount paid to date: " + currentFee;
        output += "\nProject deadline: " + deadline;

        return output;
    }

}
