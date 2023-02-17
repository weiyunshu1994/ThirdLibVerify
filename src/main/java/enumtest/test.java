package enumtest;

import javax.xml.bind.SchemaOutputResolver;

public class test {
    public static void main(String[] args) {
        Color color = Color.BLANK;
        Integer i = color.ordinal();
        System.out.println(i);
    }
}
