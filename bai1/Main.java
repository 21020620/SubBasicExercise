package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Create new employee\n2. Find employee by name\n3. Show employee list\n4. Exit");
        N = Integer.parseInt(scanner.nextLine());
        while (N <= 3 && N >= 1) {

            if (N == 1) {
                System.out.println("1 Worker, 2 Engineer, 3 Staff");
                EmployeeManagement.addNewEmployees(scanner.nextInt());
            } else if (N == 2)
                EmployeeManagement.findEmployeeByName();
            else
                EmployeeManagement.getEmployees().forEach(System.out::println);

            System.out.println("1. Create new employee\n2. Find employee by name\n3. Show employee list\n4. Exit");
            N = scanner.nextInt();
        }
    }
}
