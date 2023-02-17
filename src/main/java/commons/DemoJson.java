package commons;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoJson {
    public static void main(String[] args) {
        // 先准备一个List集合
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("alvin", 16, false, Arrays.asList("111", "222")));
        list.add(new Person("alice", 16, true, Arrays.asList("333", "444")));
        System.out.println(list);
        // 创建Gson实例
        Gson gson = new Gson();
        // 调用Gson的toJson方法
        String listJson = gson.toJson(list);
        System.out.println(listJson);
    }
    public static class Person
    {
        private String name;
        private int age;
        private boolean isMale;
        private List<String> hobbies;

        public Person(String s, int i, boolean b, List<String> asList) {
            name = s;
            age = i;
            isMale = b;
            hobbies = asList;
        }

        // 注意重写toString方法，便于查看控制台输出。

        @Override
        public String toString()
        {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append(", isMale=").append(isMale);
            sb.append(", hobbies=").append(hobbies);
            sb.append('}');
            return sb.toString();
        }
    }

}
