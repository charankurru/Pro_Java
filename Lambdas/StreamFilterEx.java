package java_progs.Lambdas;

import java.util.*;
import java.util.stream.*;

public class StreamFilterEx {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Charan");
        names.add("vamsi");
        names.add("praveen");
        names.add("sunil");
        names.add("vinay");
        names.add("Pavan");
        names.add("Rupesh");
        names.add("Akhil");

        List<String> Filterednames = names.stream().filter(name -> name.length() >= 6).collect(Collectors.toList());

        System.out.println("Names with length >= 6 is" + Filterednames);

        // Creating a list of Employee objects
        List<Employee> empdetails = new ArrayList<Employee>();
        empdetails.add(new Employee(1232, "charan", 20));
        empdetails.add(new Employee(1233, "Shiva", 21));
        empdetails.add(new Employee(1234, "Praveen", 22));
        empdetails.add(new Employee(1235, "Kalyan", 23));

        // Now we are filtering the employees whoose age is even and lenght of name is
        // >=6
        List<Employee> filteredempdetails = empdetails.stream().filter(emp -> emp.getName().length() >= 6)
                .filter(emp -> emp.getAge() % 2 == 0).collect(Collectors.toList());

        filteredempdetails.forEach(emp -> System.out.println(emp.getName()));

    }

}
