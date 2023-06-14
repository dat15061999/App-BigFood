package src.Service;

import src.User.Employees;

import java.util.Arrays;

public class EmployeesService {
    public static void main(String[] args) {
        Employees nv1 = new Employees(1,"Dao Thi Nga",01234,"user1","123456",19009071,"28 Nguyen Tri Phuong",21,"Cashier",3000,1,0);
        Employees nv2 = new Employees(2,"Nguyen Thi Linh",01234,"user2","123456",19009072,"28 Nguyen Tri Phuong",21,"Cooker",3000,1,0);
        Employees nv3 = new Employees(3,"Tran Thi Buoi",01234,"user3","123456",19009073,"28 Nguyen Tri Phuong",21,"Cooker",3000,1,0);
        Employees[] nvs = {nv1,nv2,nv3};
        System.out.println("List employees");
        for (Employees item: nvs) {
            System.out.println(item);
        }
    }
}
