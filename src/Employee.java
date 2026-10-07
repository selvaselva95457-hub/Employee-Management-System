import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private final int id;
    private final String name;
    private double salary;

    public Employee(int id , String name , double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than 0.");
        }
    }

    public void displayDetails(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString(){
        return "ID:" + id + ",Name:" + name + ",Salary:" + salary;
    }
}


class Developer extends Employee{
    private String ProgrammingLanguage;

    public Developer(int id, String name, double salary,String ProgrammingLanguage) {
        super(id, name, salary);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }

    public String getProgrammingLanguage(){
        return ProgrammingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Developer");
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Language: " + getProgrammingLanguage());
    }
}


class Manager extends Employee{
    private int teamSize;

    Manager(int id , String name , double salary , int teamSize){
        super(id,name,salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize(){
        return teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("Manager");
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("TeamSize : " + getTeamSize());

    }
}

class main{
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new Developer(101 , "Santhosh N" , 70000 , "java");
        Employee e2 = new Manager(102 , "Kokila D" , 100000 , 5);

        employees.add(e1);
        employees.add(e2);

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("\n=========== Employee Management System ==========");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Search Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Update Employee");
            System.out.println("5.Exit");

            System.out.println("Enter your Choice");
            int Choice = sc.nextInt();

            switch(Choice){
                case 1 :
                    System.out.println("\n1. Developer");
                    System.out.println("2. Manager");

                    System.out.println("Choose Your Employee Type: ");
                    int type = sc.nextInt();

                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();

                    if(id <= 0){
                        System.out.println("Invalid ID!");
                        break;
                    }

                    System.out.println("Enter Name: ");
                    String name = sc.next();

                    System.out.println("Enter Salary: ");
                    double salary = sc.nextDouble();

                    if(salary <= 0){
                        System.out.println("Invalid Salary!");
                        break;
                    }

                   if(type == 1){
                       System.out.println("Enter your programming Language: ");
                       String language = sc.next();

                       Employee newemployees = new Developer(id, name , salary , language);
                       employees.add(newemployees);

                       System.out.println("Developer Added Successfully!");
                   }else if(type == 2){
                       System.out.println("Enter Your team size: ");
                       int size = sc.nextInt();

                       Employee newemployees = new Manager(id, name, salary, size);
                       employees.add(newemployees);

                       System.out.println("Manager Added Successfully");
                   }
                   else{
                       System.out.println("Invalid Employee Type!");
                   }
                   break;

                case 2:
                    viewEmployees(employees);
                    break;

                case 3:
                    System.out.println("Enter the Employee ID to Search: ");
                    int searchID = sc.nextInt();
                    boolean found = false;
                    for(Employee e : employees){
                        if(e.getId() == searchID){
                            e.displayDetails();
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("SearchID not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Employee ID to Delete: ");
                    int deleteID  = sc.nextInt();
                    boolean deleted = false;
                    for(int i=0;i<employees.size();i++){
                        if(employees.get(i).getId() == deleteID){
                            employees.remove(i);
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("DeleteID not found");
                    }
                    break;

                case 5:
                    System.out.println("Enter Employee ID to Update: ");
                    int UpdateID = sc.nextInt();

                    boolean updated = false;
                    for(Employee e : employees){
                        if(e.getId() == UpdateID){
                            System.out.println("Enter new Salary: ");

                            double newsalary = sc.nextDouble();
                            e.setSalary(newsalary);
                            updated = true;
                            System.out.println("Salary updated successfully");
                            break;
                        }
                    }
                    if(!updated){
                        System.out.println("Employee not found!");
                }

                case 6 :
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }

        }

    }
    public static void viewEmployees(ArrayList<Employee>employees){
        if(employees.isEmpty()){
            System.out.println("No Employees found!");
            return;
        }
        for(Employee e : employees){
            e.displayDetails();
            System.out.println();
        }
    }

}


