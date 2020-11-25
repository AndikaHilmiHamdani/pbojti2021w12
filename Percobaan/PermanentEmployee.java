/**
 * PermanentEmployee
 */
public class PermanentEmployee extends Employee implements Payable{

    private int salary;
    public PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public int getPaymentAmount() {
        return (int)(salary + 0.05*salary);
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as Internship employee for "+salary+" month/s\n";
        return info;
    }
}