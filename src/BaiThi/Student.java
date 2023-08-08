package BaiThi;

import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student> {
    private static final long serialVersionUID = 5162710183389028792L;
    private  int id ;
    private String name;
    private  int age ;
    private  String made;
    private  String Address;
    private double mediumScore ;

    public Student() {
    }

    public Student(int id, String name, int age, String made, String address, double mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.made = made;
        Address = address;
        this.mediumScore = mediumScore;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", made='" + made + '\'' +
                ", Address='" + Address + '\'' +
                ", mediumScore=" + mediumScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.mediumScore -o.mediumScore);
    }
}
