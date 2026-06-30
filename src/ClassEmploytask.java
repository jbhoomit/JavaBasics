class ClassEmployTask {

    enum Department {
        HR,
        IT,
        SALES
    }

    // Student
    static class Student {

        int id;
        String name;

        static String college = "Gitanjali College";

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("Student ID : " + id);
            System.out.println("Student Name : " + name);
            System.out.println("College : " + college);
        }

        static void showCollege() {
            System.out.println("College Name : " + college);
        }
    }

    // Employee
    static class Employee {

        int empId;
        String empName;
        Department dept;

        static String company = "Lucent Innovation";

        Employee(int empId, String empName, Department dept) {
            this.empId = empId;
            this.empName = empName;
            this.dept = dept;
        }

        void display() {
            System.out.println("Employee ID : " + empId);
            System.out.println("Employee Name : " + empName);
            System.out.println("Department : " + dept);
            System.out.println("Company : " + company);
        }

        static void showCompany() {
            System.out.println("Company Name : " + company);
        }
    }

    public static void main(String[] args) {


        Student s1 = new Student(2605, "Priya");


        Employee e1 = new Employee(2903, "Bhoomit", Department.IT);


        s1.display();
        System.out.println();

        e1.display();
        System.out.println();

        Student.showCollege();
        Employee.showCompany();
    }
}