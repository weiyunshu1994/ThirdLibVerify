package commons;


import java.util.List;

public class Person
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

