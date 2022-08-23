package lab11_inheritance_abstraction;

public final class Tester extends Employee implements ScrumMember,WFH{

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the application");

    }
    public void createTicket(){
        System.out.println(getName() + " is creating the ticket");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName()+" gives an update on the bugs founded yesterday");
    }

    @Override
    public void sprintPlanning() {
        System.out.println(getName()+"  decide how many hours it take to finish testing ");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+"  working remotely");

    }
}
