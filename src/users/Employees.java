package src.users;

public class Employees extends User {
    private String role;
    private int salary;
    private int dayOff;
    private double totalSalary;

    public Employees(int id, String name, String userName, String passWord, int phone, int cccd, String address, int bod, String role, int salary, int dayOff, double totalSalary) {
        super(id, name, userName, passWord, phone, cccd, address, bod);
        this.role = role;
        this.salary = salary;
        this.dayOff = dayOff;
        this.totalSalary = totalSalary;
    }
}
