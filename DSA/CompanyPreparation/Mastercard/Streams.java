package CompanyPreparation.Mastercard;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Ashutosh"),
                new Employee(1, "Ashutosh"),
                new Employee(2, "Bshutosh"),
                new Employee(2, "Bshutosh"),
                new Employee(3, "Cshutosh"),
                new Employee(4, "Cshutosh"),
                new Employee(3, "Dshutosh")
        );

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,1,2,4);

        System.out.println(list.stream().distinct().collect(Collectors.toList()).toString());



        // Remove duplicate from the list of objects
        System.out.println(employeesList.toString());
        List<Employee> uniqueEmployees =  employeesList.stream().collect(Collectors.toMap(emp -> emp.empId , emp -> emp, (existing,replacement) ->existing))
                .values().stream().collect(Collectors.toList());

        System.out.println(uniqueEmployees.toString());

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice"),
                new Employee(2, "Bob"),
                new Employee(1, "Alicia") // Conflict: Same ID as Alice
        );


        Map<Integer,Employee> hashmap = employees.stream().collect(Collectors.toMap(employee -> employee.empId, employee -> employee, (e,r)-> {
            if(e.name.length() >= r.name.length()) {
                return e;
            } else {
                return r;
            }
        }));
        System.out.println(hashmap);

        int uniqueNumberList = Arrays.asList(1,2,3,4,5,6,1,1,1,2,3,2,3,2)
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second highest salary"));
        System.out.println(uniqueNumberList);


        // Group by department id;

        List<Employee> empListWithDepartment = Arrays.asList(
                new Employee(1, "Ashutosh", "IT"),
                new Employee(1, "Bshutosh", "HR"),
                new Employee(1, "Cshutosh", "HR"),
                new Employee(1, "Dshutosh", "IT"),
                new Employee(1, "Eshutosh", "IT")
        );

//        empListWithDepartment = empListWithDepartment.stream().filter(emp -> emp.department=="IT").collect(Collectors.toList());
        System.out.println(empListWithDepartment);

        // Group Employees by department
        Map<String,  List<Employee>> employeeGroupBy = empListWithDepartment.stream().collect(Collectors.groupingBy(emp -> emp.department));

        System.out.println(employeeGroupBy);

    }
}

class Employee {
    String name;
    int empId;
    String department;

    Employee(int id, String name) {
        this.empId = id;
        this.name = name;
    }

    Employee(int id, String name, String department) {
        this.empId = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return STR."Employee{name='\{name}', empId=\{empId}}, ,department=\{department}}";
    }
}
