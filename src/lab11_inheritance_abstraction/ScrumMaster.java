package lab11_inheritance_abstraction;

public final class ScrumMaster extends Employee implements ScrumMember,WFH {

    public ScrumMaster(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is scheduling meetings");
    }
    public void coaching(){
        System.out.println(getName()+" is coaching");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName()+" Ensures that the meeting happens");
    }

    @Override
    public void sprintPlanning() {
        System.out.println(getName()+" determine which backlog items will be handled in the next sprint");
    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+" work from home at least 3 days/week.");

    }
}
