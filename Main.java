package school_management_system;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1101,"Shilpa",500);
        Teacher teacher2 = new Teacher(1102,"Sumit",700);
        Teacher teacher3 = new Teacher(1103,"Rajesh",600);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1201,"Uttam",4);
        Student student2 = new Student(1202,"satyam",12);
        Student student3 = new Student(1203,"Shrish",5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School college1 = new School(teacherList,studentList);
        student1.payFees(5000);
        student2.payFees(6000);
        student3.payFees(5500);
        System.out.println("college has earned $"+ college1.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("college has spent for salary to " + teacher1.getName()+" and now has $" + college1.getTotalMoneyEarned());

        teacher2.receiveSalary(teacher2.getSalary());
        System.out.println("college has spent for salary to " + teacher2.getName()+" and now has $" + college1.getTotalMoneyEarned());

        teacher3.receiveSalary(teacher3.getSalary());
        System.out.println("college has spent for salary to " + teacher3.getName()+" and now has $" + college1.getTotalMoneyEarned());


        System.out.println(student2);

        teacher3.receiveSalary(teacher3.getSalary());

        System.out.println(teacher3);
    }
}