package src.User;

public class Employees extends User {
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

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    public int getDayOff() {
        return dayOff;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return  "|  Id=" + id +
                "  Name='" + name +'\'' +"  "+
                " Phone=" + phone +
                " Cccd=" + cccd +
                " UserName='" + userName + '\'' +
                " PassWord='" + passWord + '\'' +
                "  Address='" + address + '\'' +
                "  Bod=" + bod +
                " Role='" + role +'\'' +
                " Salary=" + salary +
                " DayOff=" + dayOff +
                " TotalSalary=" + totalSalary  ;
    }
}
