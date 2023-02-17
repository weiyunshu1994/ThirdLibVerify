package commons;

import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class DemoBeanUtils {
        public static void main( String[] args )
        {
            Student student = new Student();
            Map<String, Object> map = new HashMap<>();
            map.put("age",2);
            map.put("name","huahua");
            try {
                BeanUtils.populate(student,map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } finally {
            }
            System.out.println("dog:"+student);
        }

    //Student 类：
    public static class Student {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
