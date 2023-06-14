package User;

public class Employees extends User{
    private String role;
    private int salary;
    private int dayOff;
    private double totalSalary;

    public Employees(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod, String role, int salary, int dayOff, double totalSalary) {
        super(id, name, phone, userName, passWord, cccd, address, bod);
        this.role = role;
        this.salary = salary;
        this.dayOff = dayOff;
        this.totalSalary = totalSalary;
    }

    public Employees(int id, String name, int phone, String userName, String passWord, int cccd, String address, int bod) {
        super(id, name, phone, userName, passWord, cccd, address, bod);
    }
}
