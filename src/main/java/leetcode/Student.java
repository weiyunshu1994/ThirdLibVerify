package leetcode;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

//    @Override
//    public int compareTo(Object o) {
//        Student o1 = (Student) o;
//        return this.id - o1.id;
//    }
}
