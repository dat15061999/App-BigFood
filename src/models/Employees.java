package src.models;

public class Employees extends User {
    private String role;
    private static int salary;
    private static int dayOff;
    private static double totalSalary;

    public Employees(int id, String name, String userName, String passWord, int phone, int cccd, String address, int bod, String role, int salary, int dayOff) {
        super(id, name, userName, passWord, phone, cccd, address, bod);
        this.role = role;
        this.salary = salary;
        this.dayOff = dayOff;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }



    public static double getTotalSalary() {
        int salary1 = Employees.getSalary();
        int dayOff1 = Employees.getDayOff();
        return totalSalary = (salary1 - salary1/(26-dayOff1));
    };

    @Override
    public String toString() {
        return "Employees{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phone=" + phone +
                ", cccd=" + cccd +
                ", bod=" + bod +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", dayOff=" + dayOff +
                ", totalSalary=" + totalSalary +
                ",role='" + role + '\'' +
                '}';
    }
}
