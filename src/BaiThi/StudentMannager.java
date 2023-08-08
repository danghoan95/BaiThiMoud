package BaiThi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMannager {
    public static List<Student> students;
    private Scanner scanner =new Scanner(System.in);


    public StudentMannager() {
        students = new ArrayList<>();
        Student student =new Student(1,"hoan",28,"nam","hanoi",7);
        students.add(student);
    }


    public Student findById() {
        System.out.println("Input id : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void addStudent() {
        System.out.println("Enter ID ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Age ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Made");
        String made = scanner.nextLine();
        System.out.println("Enter Address ");
        String address = scanner.nextLine();
        System.out.println("Enter MediumScore ");
        double mediumScore = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, age, made, address, mediumScore);
        students.add(student);
    }

    public void editStudent() {
        Student student = findById();
        System.out.println("Enter ID :");
        student.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Name");
        student.setName(scanner.nextLine());
        System.out.println("Enter Age ");
        student.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter Made");
        student.setMade(scanner.nextLine());
        System.out.println("Enter Address ");
        student.setAddress(scanner.nextLine());
        System.out.println("Enter MediumScore ");
        student.setMediumScore(Double.parseDouble(scanner.nextLine()));

    }
    public  void displayStudent(){
        for (Student student :students){
            System.out.println(student);
        }
    }
    public void deleteStudent(){
        Student student =findById();
        students.remove(student);
    }
    public  void sortMediumScore(){
        Collections.sort(students);
        for (Student student : students){
            System.out.println(student);
        }
    }
    public  void readFile() {

        try {
            FileReader fileReader = new FileReader("hoan.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] csv = line.split(",");
                int id = Integer.parseInt(csv[0]);
                String name = csv[1];
                int age = Integer.parseInt(csv[2]);
                String made = csv[3];
                String address = csv[4];
                double mediumScore = Double.parseDouble(csv[5]);

                Student student = new Student(id ,name,age,made,address,mediumScore);

                StudentMannager.students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void write(){
        try {
            FileWriter fileWriter = new FileWriter("hoan.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < students.size(); i++) {
                String Student =students.get(i).getId() + "," + students.get(i).getName()
                        + "," + students.get(i).getAge() + "," + students.get(i).getMade()
                        + "," + students.get(i).getAddress() + "," + students.get(i).getMediumScore();
                bufferedWriter.write(Student);
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
