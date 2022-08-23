package lab11_inheritance_abstraction;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getId()+" is driving");
    }

    public void drive(){
        work();
    }
}
