package fst;

import leetcode.Student;
import org.nustaq.serialization.FSTConfiguration;

public class fst {

    public static void main(String[] args) {
        quickStart();
    }

    static void quickStart() {
        FSTConfiguration conf = FSTConfiguration.createAndroidDefaultConfiguration();
        Student object = new Student(1, "shangsan", 45);
        System.out.println("serialization, " + object);

        byte[] bytes = conf.asByteArray(object);

        Student newObject = (Student) conf.asObject(bytes);

        System.out.println("deSerialization, " + newObject);
    }

}
