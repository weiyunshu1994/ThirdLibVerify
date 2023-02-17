package commons;

import com.google.common.base.Preconditions;

public class DemoGuava {
    public static void main(String[] args) {
        String param = "未读代码";
        String name = Preconditions.checkNotNull(param);
        System.out.println(name); // 未读代码
        String param2 = null;
        String name2 = Preconditions.checkNotNull(param2, "param2 is null"); // NullPointerException
        System.out.println(name2);
    }
}
