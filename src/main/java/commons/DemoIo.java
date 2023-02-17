package commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoIo {
    public static void main(String[] args) throws IOException {

        String filepath= "C:\\Users\\liliming\\code\\Java\\java\\src\\main\\java\\commons\\test.txt";
        File file=new File(filepath);

        System.out.println("**************************");
        //写入字符串，追加
        FileUtils.writeStringToFile(file,"新数据, 字符串","UTF-8",true);
        //写入字节,追加
        FileUtils.writeByteArrayToFile(file,"新数据, 字节".getBytes("UTF-8"),true);

        //按行写入，会换行的。
        List<String> lineList=new ArrayList<String>();
        lineList.add("A");
        lineList.add("B");
        lineList.add("C");

        //按行写入,追加
        FileUtils.writeLines(file,"UTF-8",lineList,true);

        //重新读取
        System.out.println("再读:"+FileUtils.readFileToString(file,"UTF-8"));
    }

}
