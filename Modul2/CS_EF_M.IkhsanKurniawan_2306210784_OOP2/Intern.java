
/**
 * Write a description of class Intern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intern extends Employee
{
    private double hourlyRate;
    private int hoursWorked;
    
    public Intern(String name, int id, Position position, Division division, double
hourlyRate, int hoursWorked){
    super(name,id,position,division);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
}

public double totalSalary(){
    double salary = this.hourlyRate * this.hoursWorked;
    int monthlyWorked = this.hoursWorked * 20;
    
    if (monthlyWorked < 20){
        return 0;
    }
    
    else if(monthlyWorked < 80){
        return salary;
    }
    
    else{
        return (salary + ((10/100) * salary));
    }
}

 public void displayInfo(){
        System.out.println("Nama : " +  getName());
        System.out.println("ID : " + getId());
        System.out.println("Posisi : " + position);
        System.out.println("Divisi : " + division );
        System.out.println("Hourly Rate : " + this.hourlyRate );
        System.out.println("Hours Worked : " + this.hoursWorked);
        System.out.println("Total Salary : " + totalSalary());
    }
}
